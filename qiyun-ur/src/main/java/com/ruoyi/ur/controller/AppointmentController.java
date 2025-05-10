package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.dto.AppointmentRequest;
import com.ruoyi.ur.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/cancel/{id}")
    @Anonymous
    public AjaxResult cancelAppointment(@PathVariable String id) {
        boolean success = appointmentService.cancelAppointment(id);
        return success ? AjaxResult.success() : AjaxResult.error("取消预约失败");
    }

    @PutMapping("/update/{id}")
    @Anonymous
    public AjaxResult updateAppointment(
        @PathVariable String id,
        @RequestParam(required = false) String date,
        @RequestParam(required = false) String timeSlot,
        @RequestParam(required = false) String note) {
        
        boolean success = appointmentService.updateAppointment(id, date, timeSlot, note);
        return success ? AjaxResult.success() : AjaxResult.error("修改预约失败");
    }
}