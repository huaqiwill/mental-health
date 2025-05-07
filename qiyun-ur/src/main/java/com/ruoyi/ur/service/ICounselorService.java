package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.dto.AppointmentForm;
import com.ruoyi.ur.domain.dto.ReviewsForm;
import com.ruoyi.ur.domain.entity.Counselor;
import java.util.List;

public interface ICounselorService {
    List<Counselor> selectCounselorList(Counselor counselor);
    Counselor selectCounselorById(Long counselorId);
    String addAppointments(AppointmentForm form);
    String addReviewsForm(ReviewsForm form);
}