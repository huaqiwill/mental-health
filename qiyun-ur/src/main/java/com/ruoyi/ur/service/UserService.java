package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.User;

public interface UserService {
    User getById(String id);
    int insert(User user);
    int update(User user);
    int deleteById(String id);
}