package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.Announcement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    int insert(Announcement announcement);

    List<Announcement> selectByUserAndCounselor(
        @Param("userId") String userId,
        @Param("counselorId") String counselorId
    );
}