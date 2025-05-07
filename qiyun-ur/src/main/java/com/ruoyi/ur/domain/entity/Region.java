package com.ruoyi.ur.domain.entity;

import lombok.Data;

import java.util.Date;
//地区实体类
@Data
public class Region {
    private Integer regionId;
    private String regionName;
    private Date createTime;
}