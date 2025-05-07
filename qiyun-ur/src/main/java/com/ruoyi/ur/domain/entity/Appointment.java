package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

//预约实体类
@Data
public class Appointment {
    private Integer appointmentId;
    private Integer counselorId;
    private Integer userId;
    private Date startTime;
    private Date endTime;
    private Date createTime;
}