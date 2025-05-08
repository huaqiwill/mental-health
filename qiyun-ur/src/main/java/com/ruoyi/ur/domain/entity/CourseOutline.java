// 课程大纲实体类
package com.ruoyi.ur.domain.entity;

import lombok.Data;

@Data
public class CourseOutline {
    private String id;
    private String courseId;
    private String chapterTitle;
    private String lessonId;
    private String lessonTitle;
    private String duration;
    private String videoUrl;
    private Boolean isFree;
    private Integer sortOrder;
}