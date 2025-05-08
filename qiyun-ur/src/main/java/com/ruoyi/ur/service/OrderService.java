package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.Order;

public interface OrderService {
    Order getById(String id);
    int insert(Order order);
}