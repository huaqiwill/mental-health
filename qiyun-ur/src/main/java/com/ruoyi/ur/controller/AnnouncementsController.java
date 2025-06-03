package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.service.IAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/announcement")
public class AnnouncementsController extends BaseController {

    @Autowired
    private IAnnouncementService IAnnouncementService;

    @GetMapping("/{id}")
    @Anonymous
    public AjaxResult getById(@PathVariable String id) {
        return success(IAnnouncementService.getById(id));
    }

    @GetMapping("/list")
    @Anonymous
    public AjaxResult list() {
        return success(IAnnouncementService.selectList());
    }
}