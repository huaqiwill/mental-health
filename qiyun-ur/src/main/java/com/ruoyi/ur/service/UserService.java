package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.dto.UserDto;
import com.ruoyi.ur.domain.dto.UserUpdateDto;

public interface UserService {
    UserDto getUserById(String id);

    int updateUserInfo(String id, UserUpdateDto dto);
}