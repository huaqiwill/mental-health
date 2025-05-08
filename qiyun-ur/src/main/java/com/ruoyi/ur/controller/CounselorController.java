package com.ruoyi.ur.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.entity.Counselor;
import com.ruoyi.ur.service.CounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@RestController
@RequestMapping("/counselor")
public class CounselorController{
    
    @Autowired
    private CounselorService counselorService;

    @GetMapping("/{id}")
    public AjaxResult getById(@PathVariable String id) {
        return success(counselorService.getById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Counselor counselor) {
        return success(counselorService.insert(counselor));
    }

    @PutMapping
    public AjaxResult update(@RequestBody Counselor counselor) {
        return success(counselorService.update(counselor));
    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable String id) {
        return success(counselorService.deleteById(id));
    }
}