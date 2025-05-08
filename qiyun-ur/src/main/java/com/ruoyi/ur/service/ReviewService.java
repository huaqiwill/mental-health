package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.Review;

import java.util.List;

public interface ReviewService {
    Review getById(String id);
    int insert(Review review);
    int update(Review review);
    int deleteById(String id);
    List<Review> selectList(Review review);
}