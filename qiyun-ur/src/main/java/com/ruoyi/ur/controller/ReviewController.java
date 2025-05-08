package com.ruoyi.ur.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.entity.Review;
import com.ruoyi.ur.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/review")
public class ReviewController{
    
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/{id}")
    public AjaxResult getById(@PathVariable String id) {
        return success(reviewService.getById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Review review) {
        return success(reviewService.insert(review));
    }

    @GetMapping("/list")
    public AjaxResult list(Review review) {
        return success(reviewService.selectList(review));
    }
}