package com.ruoyi.ur.controller;

import com.github.pagehelper.PageInfo;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.dto.CounselorQueryRequest;
import com.ruoyi.ur.domain.vo.CounselorVo;
import com.ruoyi.ur.service.CounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/counselor")
public class CounselorController{
    
    @Autowired
    private CounselorService counselorService;

    // 获取咨询师信息
    @PostMapping("/list")
    @Anonymous
    public AjaxResult getCounselorList(@RequestBody CounselorQueryRequest request) {
        PageInfo<CounselorVo> list = counselorService.searchCounselors(request);
        int total = counselorService.countCounselors(request);

        return success()
                .put("total", total)
                .put("list", list);
    }
  }