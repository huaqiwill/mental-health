package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.dto.AppointmentForm;
import com.ruoyi.ur.domain.entity.Appointment;
import com.ruoyi.ur.domain.entity.Counselor;
import com.ruoyi.ur.domain.entity.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CounselorMapper {
    List<Counselor> selectCounselorList();
    Counselor selectCounselorById(Long counselorId);
    void addAppointments(Appointment form);
    List<Appointment> selectAppointmentsByUserId(Long userId);
    void addReviews(Review form);
}