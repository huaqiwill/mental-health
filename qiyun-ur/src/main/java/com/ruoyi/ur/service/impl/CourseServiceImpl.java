package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.entity.Course;
import com.ruoyi.ur.mapper.CoursesMapper;
import com.ruoyi.ur.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CoursesService {
    @Autowired
    private CoursesMapper coursesMapper;
    @Override
    public List<Course> selectCoursesList() {
        return coursesMapper.selectCoursesList();
    }

    @Override
    public Course selectCourseById(Long courseId) {
        return coursesMapper.selectCourseById(courseId);
    }
}
