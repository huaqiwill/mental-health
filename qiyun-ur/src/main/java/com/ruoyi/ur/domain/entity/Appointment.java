package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Appointment {
    private String id;
    private String counselorId;
    private String serviceId;
    private String userId;
    private Date date;
    private String timeSlot;
    private String note;
    private Integer status;
    private Date createTime;
}