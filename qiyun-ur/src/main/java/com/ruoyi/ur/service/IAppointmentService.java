package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.dto.AppointmentRequest;

public interface IAppointmentService {
    String createAppointment(AppointmentRequest request);

    boolean cancelAppointment(String id);

    boolean updateAppointment(String id, String date, String timeSlot, String note);
}