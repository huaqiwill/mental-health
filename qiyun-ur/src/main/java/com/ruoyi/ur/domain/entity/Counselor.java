package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Counselor {
    private Long counselorId;
    private String name;
    private String pictureUrl;
    private String personalIntroduction;
    private String expertiseAreas;
    private Integer yearsOfPractice;
    private String supportedTypes;
    private BigDecimal teachingPrice;
    private Integer counselorLevel;
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
}