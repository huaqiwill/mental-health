package com.ruoyi.ur.service;

import com.github.pagehelper.PageInfo;
import com.ruoyi.ur.domain.dto.CounselorReviewDto;
import com.ruoyi.ur.domain.dto.ReviewDto;

public interface IReviewService {
    String submitReview(ReviewDto reviewDto);
    PageInfo<CounselorReviewDto> getReviews(String targetId, String targetType, Integer page, Integer pageSize);
}