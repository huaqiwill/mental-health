package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;
    @GetMapping("/list")
    @Anonymous
    public AjaxResult list() {
        return success(coursesService.selectCoursesList());
    }

    @GetMapping("/{courseId}")
    @Anonymous
    public AjaxResult getCourseById(@PathVariable Long courseId) {
        return success(coursesService.selectCourseById(courseId));
    }
}
