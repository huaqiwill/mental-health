package com.ruoyi.ur.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.entity.User;
import com.ruoyi.ur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public AjaxResult getById(@PathVariable String id) {
        return success(userService.getById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody User user) {
        return success(userService.insert(user));
    }
}