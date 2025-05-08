package com.ruoyi.ur.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.entity.Course;
import com.ruoyi.ur.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/course")
public class CourseController{
    
    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    public AjaxResult getById(@PathVariable String id) {
        return success(courseService.getById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Course course) {
        return success(courseService.insert(course));
    }

    @PutMapping
    public AjaxResult update(@RequestBody Course course) {
        return success(courseService.update(course));
    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable String id) {
        return success(courseService.deleteById(id));
    }

    @GetMapping("/list")
    public AjaxResult list(Course course) {
        return success(courseService.selectList(course));
    }
}