package com.ruoyi.ur.domain.entity;

import lombok.Data;

import java.util.Date;

// 咨询师-地区关联实体类
@Data
public class CounselorRegion {
    private Integer id;
    private Integer counselorId;
    private Integer regionId;
    private Date createTime;
}