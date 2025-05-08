package com.ruoyi.ur.controller;

import com.ruoyi.ur.common.ApiResult;
import com.ruoyi.ur.domain.entity.User;
import com.ruoyi.ur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Anonymous;

@RestController
@RequestMapping("/user")
//用户信息
public class UserController {

    @Autowired
    private UserService userService;

    @Anonymous
    @PostMapping("/register")
    public ApiResult<String> register(@RequestBody User user) {
        try {
            String registerData = userService.register(user);
            if (registerData == null) {
                return (ApiResult<String>) ApiResult.error("注册失败，返回数据为空");
            }
            return ApiResult.success(registerData);
        } catch (Exception e) {
            return (ApiResult<String>) ApiResult.error("注册失败：" + e.getMessage());
        }
    }


}
