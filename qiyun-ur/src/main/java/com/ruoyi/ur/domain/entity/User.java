package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
//用户实体类
public class User {
    private Integer userId;
    private String nickname;
    private String gender;
    private Integer age;
    private String phoneNumber;
    private String email;
    private Integer status;
    private String account;
    private String password;
    private String avatar;
    private String introduction;
    private Date createTime;
    private Date lastLoginTime;
}