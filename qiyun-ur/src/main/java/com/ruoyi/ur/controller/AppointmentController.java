package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.dto.AppointmentRequest;
import com.ruoyi.ur.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create")
    @Anonymous
    public AjaxResult createAppointment(@RequestBody AppointmentRequest request) {
        String orderId = appointmentService.createAppointment(request);
        return AjaxResult.success(orderId);
    }
}