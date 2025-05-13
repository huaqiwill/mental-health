package com.ruoyi.ur.service;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.GetPresignedObjectUrlArgs;
import io.minio.http.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class MinioService {

    @Autowired
    private MinioClient minioClient;
    
    @Value("${minio.bucketName}")
    private String bucketName;

    @Value("${minio.endpoint}")
    private String endpoint;

    private static final List<String> ALLOWED_FILE_TYPES = Arrays.asList(
        "image/jpeg", "image/png", "image/gif", 
        "video/mp4", "video/quicktime", "video/x-msvideo",
        "application/pdf", "application/msword"
    );

    // 根据文件扩展名校验（更可靠的方式）
    private static final List<String> ALLOWED_EXTENSIONS = Arrays.asList(
        ".jpg", ".jpeg", ".png", ".gif",
        ".mp4", ".mov", ".avi",
        ".pdf", ".doc", ".docx"
    );

    // 最大文件大小 (1GB)
    private static final long MAX_FILE_SIZE = 1 * 1024 * 1024 * 1024;



    public String uploadFile(MultipartFile file, String objectName) throws Exception {
        // 检查存储桶是否存在
        boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
        if (!found) {
            minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }

        if (file.isEmpty()) {
            throw new RuntimeException("上传文件为空");
        }

         if (file.getSize() > MAX_FILE_SIZE) {
             System.out.println("原始文件名：" + file.getName());
             System.out.println("文件大小：" + file.getSize());
             throw new RuntimeException("文件大小不能超过1GB");
        }

        // 通过扩展名和ContentType双重校验
        String originalFilename = file.getOriginalFilename();
        String extension = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
        
        if (!ALLOWED_EXTENSIONS.contains(extension)) {
            throw new RuntimeException("不支持的文件格式: " + extension);
        }

        String contentType = file.getContentType();
        if (!ALLOWED_FILE_TYPES.contains(contentType)) {
            throw new RuntimeException("不支持的文件类型: " + contentType);
        }
        
        try (InputStream inputStream = file.getInputStream()) {
            minioClient.putObject(
                PutObjectArgs.builder()
                    .bucket(bucketName)
                    .object(objectName)
                    .stream(inputStream, file.getSize(), -1)
                    .contentType(file.getContentType())
                    .build());
        } 
        // 直接拼接永久URL
        return objectName;
    }
}