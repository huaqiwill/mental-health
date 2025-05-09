package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.dto.OrderDetailDto;
import com.ruoyi.ur.domain.entity.Order;
import com.ruoyi.ur.mapper.OrderMapper;
import com.ruoyi.ur.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderDetailDto getOrderDetailById(String id) {
        return orderMapper.selectOrderDetailById(id);
    }
}