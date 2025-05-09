package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.dto.OrderDetailDto;

public interface OrderService {
    OrderDetailDto getOrderDetailById(String id);
}