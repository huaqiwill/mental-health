package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.common.ApiResult;
import com.ruoyi.ur.domain.dto.AppointmentForm;
import com.ruoyi.ur.domain.dto.ReviewsForm;
import com.ruoyi.ur.domain.entity.Counselor;
import com.ruoyi.ur.domain.entity.Review;
import com.ruoyi.ur.service.ICounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
@RequestMapping("/counselors")
public class CounselorsController extends BaseController {
    
    @Autowired
    private ICounselorService counselorService;

    // 查询咨询师列表
    @Anonymous
    @GetMapping("/list")
    public AjaxResult list(Counselor counselor) {
        return success(counselorService.selectCounselorList(counselor));
    }

    // 根据ID查询咨询师详情
    @Anonymous
    @GetMapping("/{counselorId}")
    public AjaxResult getInfo(@PathVariable Long counselorId) {
        return success(counselorService.selectCounselorById(counselorId));
    }

    // 心理咨询预约
    @Anonymous
    @PostMapping("/appointments")
    public ApiResult createAppointment(@RequestBody AppointmentForm form) {
        String result = counselorService.addAppointments(form);
        return ApiResult.success(result);
    }

    // 咨询师评价
    @Anonymous
    @PostMapping("/reviews")
    public ApiResult createReview(@RequestBody ReviewsForm form) {
        String result = counselorService.addReviewsForm(form);
        return ApiResult.success(result);
    }
}
