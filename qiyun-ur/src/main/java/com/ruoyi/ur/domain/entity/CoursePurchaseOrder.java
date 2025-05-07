package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
//课程购买订单实体类
public class CoursePurchaseOrder {
    private String orderId;
    private Integer courseInfo;
    private Integer userId;
    private Date purchaseTime;
    private Double orderAmount;
    private String paymentStatus;
    private Date createTime;
}