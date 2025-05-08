package com.ruoyi.ur.service.impl;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.ur.domain.entity.User;
import com.ruoyi.ur.mapper.UserMapper;
import com.ruoyi.ur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public String register(User user) {
        // 1. 检查用户名是否已存在
        if (userMapper.existsByUsername(user.getAccount())) {
            throw new ServiceException("用户名已存在");
        }

        // 2. 密码加密（示例）
        user.setPassword(encryptPassword(user.getPassword()));
        
        // 3. 设置默认属性
        user.setStatus(1); // 1为正常账号、2为异常
        user.setCreateTime(new Date());
        
        // 4. 执行插入
        if (userMapper.insertUser(user) <= 0) {
            throw new ServiceException("注册失败，请稍后重试");
        }
        
        return "注册成功";
    }

    //密码加密
    private String encryptPassword(String password) {
        return SecurityUtils.encryptPassword(password);
    }
}
