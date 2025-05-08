package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(String id);
    int insert(User user);
    int updateById(User user);
    int deleteById(String id);
}