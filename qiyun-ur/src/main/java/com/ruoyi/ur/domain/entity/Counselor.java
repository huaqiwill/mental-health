package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

//咨询师实体类
@Data
public class Counselor {
    private Integer counselorId;
    private String name;
    private String pictureUrl;
    private String personalIntroduction;
    private String expertiseAreas;
    private Integer yearsOfPractice;
    private String supportedTypes;
    private Double teachingPrice;
    private String counselorLevel;
    private String counselorType;
    private String tags;
    private Double rating;
    private Integer totalPracticeHours;
    private String goodAtProblems;
    private String treatmentMethods;
    private Integer consultationDuration;
    private String professionalQualification;
    private String certificationCertificateUrl;
    private String workingHours;
    private Date createTime;
    private Date updateTime;
}