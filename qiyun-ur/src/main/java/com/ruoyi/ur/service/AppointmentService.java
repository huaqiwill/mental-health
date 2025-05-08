package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment getById(String id);
    int insert(Appointment appointment);
    int update(Appointment appointment);
    int deleteById(String id);
    List<Appointment> selectList(Appointment appointment);
}