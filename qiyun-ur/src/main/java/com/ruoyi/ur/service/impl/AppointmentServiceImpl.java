package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.dto.AppointmentRequest;
import com.ruoyi.ur.domain.entity.Announcement;
import com.ruoyi.ur.mapper.AppointmentMapper;
import com.ruoyi.ur.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Override
    public String createAppointment(AppointmentRequest request) {
        // 检查是否存在未完成的预约
        List<Announcement> existingAppointments = appointmentMapper.selectByUserAndCounselor(
            request.getUserId(), 
            request.getCounselorId()
        );
        
        Date now = new Date();
        for (Announcement existing : existingAppointments) {
            // 提取已有预约的结束时间
            String existingEndTime = existing.getTimeSlot().split("-")[1].trim();
            String requestEndTime = request.getTimeSlot().split("-")[1].trim();
            
            if (existing.getStatus() != 2 && // 2表示已取消
                (existing.getDate().equals(request.getDate()) && 
                 existingEndTime.equals(requestEndTime))) {
                throw new RuntimeException("该时间段已被预约，请选择其他时间");
            }
        }

        Announcement appointment = new Announcement();
        appointment.setId("y" + System.currentTimeMillis());
        appointment.setCounselorId(request.getCounselorId());
        appointment.setServiceId(request.getServiceId());
        appointment.setUserId(request.getUserId());
        appointment.setDate(request.getDate());
        appointment.setTimeSlot(request.getTimeSlot());
        appointment.setNote(request.getNote());
        appointment.setStatus(0);
        appointment.setCreateTime(new Date());
        
        appointmentMapper.insert(appointment);
        return appointment.getId();
    }
}