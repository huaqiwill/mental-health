package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class Counselor {
    private String id;
    private String name;
    private String avatar;
    private String title;
    private Boolean isVerified;
    private List<String> tags;
    private Double price;
    private Double rating;
    private Integer sessionCount;
    private String introduction;
    private String education;
    private String experience;
    private List<String> certificates;
    private List<String> services;
    private List<String> availability;
    private Date createTime;
    private Date updateTime;
    private Integer regionId;
}