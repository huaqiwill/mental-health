package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
//课程详情实体类
public class CourseDetail {
    private Integer mainTitleId;
    private Integer courseId;
    private String mainTitle;
    private Integer subclassHours;
    private Integer subtotalDuration;
    private Integer subTitleId;
    private String subTitleImageUrl;
    private Integer subTitleDuration;
    private String videoInfo;
    private Date createTime;
}