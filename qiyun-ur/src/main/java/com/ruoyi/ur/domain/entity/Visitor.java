package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
//来访信息实体类
public class Visitor {
    private Integer visitorId;
    private Integer counselorId;
    private String realName;
    private Date birthDate;
    private String gender;
    private String contactInfo;
    private String emergencyRealName;
    private String emergencyRelationship;
    private String emergencyContact;
    private String hasPsychoConsulted;
    private String hasPsychoTreated;
    private String selfHarmBehavior;
    private String problemTypes;
    private String problemDescription;
    private String emotionalStatus;
    private String childrenCount;
    private String livingCity;
    private String occupation;
    private String incomeLevel;
    private String educationLevel;
    private String messageToCounselor;
    private Date createTime;
}