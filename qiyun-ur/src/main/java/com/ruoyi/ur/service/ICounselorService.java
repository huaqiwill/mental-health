package com.ruoyi.ur.service;

import com.github.pagehelper.PageInfo;
import com.ruoyi.ur.domain.dto.CounselorDetailDto;
import com.ruoyi.ur.domain.dto.CounselorQueryRequest;
import com.ruoyi.ur.domain.vo.CounselorVo;

public interface ICounselorService {
    PageInfo<CounselorVo> searchCounselors(CounselorQueryRequest request);
    int countCounselors(CounselorQueryRequest request);
    CounselorDetailDto getCounselorDetail(String id);
}