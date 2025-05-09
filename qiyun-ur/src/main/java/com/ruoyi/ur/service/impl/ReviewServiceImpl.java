package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.dto.ReviewDto;
import com.ruoyi.ur.domain.entity.Review;
import com.ruoyi.ur.mapper.ReviewMapper;
import com.ruoyi.ur.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public String submitReview(ReviewDto reviewDto) {
        // 检查是否已评价过
        Review existingReview = reviewMapper.selectByOrderId(reviewDto.getOrderId());
        
        Review review = new Review();
        review.setCounselorId(reviewDto.getCounselorId());
        review.setOrderId(reviewDto.getOrderId());
        review.setContent(reviewDto.getContent());
        review.setRating(reviewDto.getRating());
        review.setCreateTime(new Date());

        if(existingReview != null) {
            // 更新评价
            review.setReviewId(existingReview.getReviewId());
            reviewMapper.update(review);
        } else {
            // 新增评价
            review.setReviewId("r" + System.currentTimeMillis());
            reviewMapper.insert(review);
        }
        
        return review.getReviewId();
    }
}