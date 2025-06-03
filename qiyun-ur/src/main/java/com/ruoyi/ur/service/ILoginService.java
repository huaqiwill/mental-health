package com.ruoyi.ur.service;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.WxLoginRequest;

/**
 * 登录服务接口
 */
public interface ILoginService {
    
    /**
     * 微信小程序登录
     * @param loginRequest 登录请求参数
     * @return 登录结果
     */
    AjaxResult wxLogin(WxLoginRequest loginRequest);
} 