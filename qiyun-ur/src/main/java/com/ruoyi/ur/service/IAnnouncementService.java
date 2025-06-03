package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.vo.AnnouncementVo;
import java.util.List;

public interface IAnnouncementService {
    AnnouncementVo getById(String id);
    List<AnnouncementVo> selectList();
}