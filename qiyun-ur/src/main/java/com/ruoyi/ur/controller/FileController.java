package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.uuid.UUID;
import com.ruoyi.ur.service.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private MinioService minioService;

    @PostMapping(value = "/upload")
    @Anonymous
    public AjaxResult uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            
            String objectName = UUID.randomUUID().toString() + "-" + file.getOriginalFilename();
            String url = minioService.uploadFile(file, objectName);
            return AjaxResult.success("上传成功", url);
        
        }catch (RuntimeException e) {

            return AjaxResult.error(e.getMessage()); 

        } catch (Exception e) {

            return AjaxResult.error("上传失败: " + e.getMessage());
        
        }
    }
}