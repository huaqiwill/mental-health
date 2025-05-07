package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;
//心理预约订单实体类
@Data
public class PsychologicalAppointmentOrder {
    private String orderId;
    private String appointmentName;
    private Integer authorInfo;
    private Integer userId;
    private Double orderAmount;
    private String paymentStatus;
    private Date createTime;
    private Date updateTime;
}