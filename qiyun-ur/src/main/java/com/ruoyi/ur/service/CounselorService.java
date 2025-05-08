package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.Counselor;
import java.util.List;

public interface CounselorService {
    Counselor getById(String id);
    int insert(Counselor counselor);
    int update(Counselor counselor);
    int deleteById(String id);
    List<Counselor> list(Counselor counselor);
}