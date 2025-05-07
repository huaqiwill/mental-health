package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;
//课程实体类
@Data
public class Course {
    private Integer courseId;
    private String courseName;
    private String courseImageUrl;
    private String courseTags;
    private Integer classHours;
    private Integer totalDuration;
    private Double price;
    private String address;
    private String courseType;
    private Date startTime;
    private Integer detailId;
    private String courseImagesUrls;
    private Integer cumulativeStudents;
    private Double courseRating;
    private String authorName;
    private String authorIntroduction;
    private String courseIntroduction;
    private String courseContent;
    private Date createTime;
    private Date updateTime;
}