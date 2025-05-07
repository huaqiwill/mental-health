package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 检查用户名是否存在
    boolean existsByUsername(String username);
    
    // 用户注册
    int insertUser(User user);
    
}