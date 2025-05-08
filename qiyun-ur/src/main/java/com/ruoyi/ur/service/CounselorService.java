package com.ruoyi.ur.service;

import com.github.pagehelper.PageInfo;
import com.ruoyi.ur.domain.dto.CounselorQueryRequest;
import com.ruoyi.ur.domain.vo.CounselorVo;

import java.util.List;

public interface CounselorService {
    PageInfo<CounselorVo> searchCounselors(CounselorQueryRequest request);
    int countCounselors(CounselorQueryRequest request);
}