package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private String id;
    private String nickname;
    private String avatar;
    private String phone;
    private String gender;
    private Integer age;
    private String bio;
    private Date createTime;
    private Date updateTime;
}