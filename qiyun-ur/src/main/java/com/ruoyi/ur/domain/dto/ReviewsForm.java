package com.ruoyi.ur.domain.dto;

import lombok.Data;

@Data
public class ReviewsForm {
    private String reviewId;
    private Long counselorId;
    private Long userId;
    private String reviewContent;
}
