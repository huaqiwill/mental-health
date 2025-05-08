package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/announcement")
public class AnnouncementsController extends BaseController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/{id}")
    @Anonymous
    public AjaxResult getById(@PathVariable String id) {
        return success(announcementService.getById(id));
    }

    @GetMapping("/list")
    @Anonymous
    public AjaxResult list() {
        return success(announcementService.selectList());
    }
}