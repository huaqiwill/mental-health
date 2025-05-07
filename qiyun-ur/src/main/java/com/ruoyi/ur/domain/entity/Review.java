package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;
//评价实体类
@Data
public class Review {
    private Integer reviewId;
    private Integer counselorId;
    private Integer userId;
    private String reviewContent;
    private Date reviewTime;
    private Date createTime;
}