package com.ruoyi.ur.domain.dto;

import lombok.Data;

import java.util.Date;

//心理咨询预约信息
@Data
public class AppointmentForm {
    private Long appointmentId;
    private Long userId;
    private Long counselorId;
    private Date startTime;
    private Date endTime;
}
