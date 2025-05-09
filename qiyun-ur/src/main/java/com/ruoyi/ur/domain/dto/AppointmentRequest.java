package com.ruoyi.ur.domain.dto;

import lombok.Data;

@Data
public class AppointmentRequest {
    private String counselorId;
    private String serviceId;
    private String userId;
    private String date;
    private String timeSlot;
    private String note;
}