package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.dto.OrderDetailDto;

import java.util.Map;

public interface IOrderService {
    OrderDetailDto getOrderDetailById(String id);
    
    Map<String, Object> getUserAppointments(String userId, String status, int page, int pageSize);
}