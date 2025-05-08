package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.entity.Review;
import com.ruoyi.ur.mapper.ReviewMapper;
import com.ruoyi.ur.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public Review getById(String id) {
        return null;
    }

    @Override
    public int insert(Review review) {
        return 0;
    }

    @Override
    public int update(Review review) {
        return 0;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public List<Review> selectList(Review review) {
        return Collections.emptyList();
    }
}