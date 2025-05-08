package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    Appointment selectById(String id);
    int insert(Appointment appointment);
    int updateById(Appointment appointment);
    int deleteById(String id);
    List<Appointment> selectList(Appointment appointment);
}