package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.entity.User;
import com.ruoyi.ur.mapper.UserMapper;
import com.ruoyi.ur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int deleteById(String id) {
        return userMapper.deleteById(id);
    }
}