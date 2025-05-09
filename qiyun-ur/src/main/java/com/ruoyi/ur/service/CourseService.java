package com.ruoyi.ur.service;

import com.github.pagehelper.PageInfo;
import com.ruoyi.ur.domain.dto.CourseDto;

public interface CourseService {
    PageInfo<CourseDto> getCourses(String keyword, String categoryId, String sortBy, Integer page, Integer pageSize);
}