package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.Course;
import java.util.List;

public interface CourseService {
    Course getById(String id);
    int insert(Course course);
    int update(Course course);
    int deleteById(String id);
    List<Course> selectList(Course course);
}