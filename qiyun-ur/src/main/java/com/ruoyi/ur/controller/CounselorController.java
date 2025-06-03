package com.ruoyi.ur.controller;

import com.github.pagehelper.PageInfo;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.dto.CounselorQueryRequest;
import com.ruoyi.ur.domain.vo.CounselorVo;
import com.ruoyi.ur.service.ICounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/counselor")
public class CounselorController{
    
    @Autowired
    private ICounselorService ICounselorService;

    // 获取咨询师信息
    @PostMapping("/list")
    @Anonymous
    public AjaxResult getCounselorList(@RequestBody CounselorQueryRequest request) {
        PageInfo<CounselorVo> list = ICounselorService.searchCounselors(request);
        int total = ICounselorService.countCounselors(request);

        return success()
                .put("total", total)
                .put("list", list);
    }

    // 获取咨询师详细信息 
    @GetMapping("/{id}")
    @Anonymous
    public AjaxResult getCounselorDetail(@PathVariable String id) {
        return AjaxResult.success(ICounselorService.getCounselorDetail(id));
    }
  }