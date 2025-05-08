package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.entity.Course;
import com.ruoyi.ur.mapper.CourseMapper;
import com.ruoyi.ur.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course getById(String id) {
        return courseMapper.selectById(id);
    }

    @Override
    public int insert(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int update(Course course) {
        return courseMapper.updateById(course);
    }

    @Override
    public int deleteById(String id) {
        return courseMapper.deleteById(id);
    }

    @Override
    public List<Course> selectList(Course course) {
        return courseMapper.selectList(course);
    }
}