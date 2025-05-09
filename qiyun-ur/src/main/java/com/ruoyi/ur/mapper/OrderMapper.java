package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.dto.OrderDetailDto;
import com.ruoyi.ur.domain.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    OrderDetailDto selectOrderDetailById(@Param("id") String id);
}