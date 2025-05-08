package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class Course {
    private String id;
    private String title;
    private String coverImage;
    private String teacher;
    private String teacherTitle;
    private String teacherAvatar;
    private Double price;
    private Double originalPrice;
    private Integer lessonCount;
    private Integer studentCount;
    private Double rating;
    private List<String> tags;
    private String description;
    private Date createTime;
    private Date updateTime;
}