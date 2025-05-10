package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.dto.OrderDetailDto;
import com.ruoyi.ur.domain.dto.UserAppointmentDto;
import java.util.List;
import java.util.Map;

public interface OrderService {
    OrderDetailDto getOrderDetailById(String id);
    
    Map<String, Object> getUserAppointments(String userId, String status, int page, int pageSize);
}