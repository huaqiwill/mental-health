package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    Review selectById(String id);
    int insert(Review review);
    int updateById(Review review);
    int deleteById(String id);
    List<Review> selectList(Review review);
}