package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Order {
    private String id;
    private String orderNo;
    private String appointmentId;
    private Double price;
    private Double discount;
    private Double actualPaid;
    private String paymentMethod;
    private Date paymentTime;
    private String status;
    private Date createTime;
}