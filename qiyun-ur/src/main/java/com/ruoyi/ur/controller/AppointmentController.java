package com.ruoyi.ur.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.entity.Appointment;
import com.ruoyi.ur.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/{id}")
    public AjaxResult getById(@PathVariable String id) {
        return success(appointmentService.getById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Appointment appointment) {
        return success(appointmentService.insert(appointment));
    }

    @GetMapping("/list")
    public AjaxResult list(Appointment appointment) {
        return success(appointmentService.selectList(appointment));
    }
}