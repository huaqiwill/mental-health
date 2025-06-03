package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.dto.AppointmentRequest;
import com.ruoyi.ur.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private IAppointmentService IAppointmentService;

    @PostMapping("/create")
    @Anonymous
    public AjaxResult createAppointment(@RequestBody AppointmentRequest request) {
        String orderId = IAppointmentService.createAppointment(request);
        return AjaxResult.success(orderId);
    }

    @PutMapping("/cancel/{id}")
    @Anonymous
    public AjaxResult cancelAppointment(@PathVariable String id) {
        boolean success = IAppointmentService.cancelAppointment(id);
        return success ? AjaxResult.success() : AjaxResult.error("取消预约失败");
    }

    @PutMapping("/update/{id}")
    @Anonymous
    public AjaxResult updateAppointment(
        @PathVariable String id,
        @RequestParam(required = false) String date,
        @RequestParam(required = false) String timeSlot,
        @RequestParam(required = false) String note) {
        
        boolean success = IAppointmentService.updateAppointment(id, date, timeSlot, note);
        return success ? AjaxResult.success() : AjaxResult.error("修改预约失败");
    }
}