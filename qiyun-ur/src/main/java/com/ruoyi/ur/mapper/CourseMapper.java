package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    Course selectById(String id);
    int insert(Course course);
    int updateById(Course course);
    int deleteById(String id);
    List<Course> selectList(Course course);
}