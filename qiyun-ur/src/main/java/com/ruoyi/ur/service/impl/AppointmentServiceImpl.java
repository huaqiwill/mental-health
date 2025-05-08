package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.entity.Appointment;
import com.ruoyi.ur.mapper.AppointmentMapper;
import com.ruoyi.ur.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Override
    public Appointment getById(String id) {
        return appointmentMapper.selectById(id);
    }

    @Override
    public int insert(Appointment appointment) {
        return appointmentMapper.insert(appointment);
    }

    @Override
    public int update(Appointment appointment) {
        return 0;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public List<Appointment> selectList(Appointment appointment) {
        return Collections.emptyList();
    }
}