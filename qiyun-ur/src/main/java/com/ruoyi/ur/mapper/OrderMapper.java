package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order selectById(String id);
    int insert(Order order);
}