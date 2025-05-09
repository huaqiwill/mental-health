package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.Review;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {
    int insert(Review review);
    int update(Review review);
    Review selectByOrderId(String orderId);
}