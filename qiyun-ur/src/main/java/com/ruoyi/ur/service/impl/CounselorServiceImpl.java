package com.ruoyi.ur.service.impl;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.ur.domain.dto.AppointmentForm;
import com.ruoyi.ur.domain.dto.ReviewsForm;
import com.ruoyi.ur.domain.entity.Appointment;
import com.ruoyi.ur.domain.entity.Counselor;
import com.ruoyi.ur.domain.entity.Review;
import com.ruoyi.ur.mapper.CounselorMapper;
import com.ruoyi.ur.service.ICounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class CounselorServiceImpl implements ICounselorService {
    @Autowired
    private CounselorMapper counselorMapper;

    //获取全部咨询师信息
    @Override
    public List<Counselor> selectCounselorList(Counselor counselor) {
        return counselorMapper.selectCounselorList(counselor);
    }

    //获取某位咨询师信息
    @Override
    public Counselor selectCounselorById(Long counselorId) {
        return counselorMapper.selectCounselorById(counselorId);
    }

    //预约咨询
    @Override
    @Transactional
    public String addAppointments(AppointmentForm form) {
        // 是否已预约
        List<Appointment> existingAppointments = counselorMapper.selectAppointmentsByUserId(form.getUserId());
        for (Appointment app : existingAppointments) {
            if (app.getStatus() == 1) {
                throw new ServiceException("您已有未完成的预约，请先完成或取消");
            }
        }
        // 获取预约编号
        String appointmentId = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
                + String.format("%05d", new Random().nextInt(100000));
        form.setAppointmentId(Long.parseLong(appointmentId));
        // 表单预约信息封装到预约类中
        Appointment appointment = new Appointment();
        BeanUtils.copyProperties(form, appointment);
        // 预约状态单独设置
        appointment.setStatus(1);

        counselorMapper.addAppointments(appointment);
        return "预约提交成功，预约编号：" + appointment.getAppointmentId();
    }

    @Override
    @Transactional
    public String addReviewsForm(ReviewsForm form) {
        Review review = new Review();
        BeanUtils.copyProperties(form, review);

        // 生成评论编号
        String reviewId = "pl" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        review.setReviewId(reviewId);

        // 设置评论时间
        review.setReviewTime(new Date());

        counselorMapper.addReviews(review);
        return "评论成功";
    }

}