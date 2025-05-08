package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.Course;

import java.util.List;

public interface CoursesService {
    List<Course> selectCoursesList();
    Course selectCourseById(Long courseId);
}
