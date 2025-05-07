package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;
//课程阅读记录实体类
@Data
public class CourseReadRecord {
    private Integer recordId;
    private Integer userId;
    private Integer courseId;
    private Date startReadTime;
    private Date endReadTime;
    private Integer readDuration;
    private Date lastReadTime;
    private String isFinished;
    private Date createTime;
}