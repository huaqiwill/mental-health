// 公告实体类
package com.ruoyi.ur.domain.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Announcement {
    private String id;
    private String content;
    private Date publishTime;
    private Integer status;
    private Date createTime;
    private Date updateTime;
}