package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.dto.OrderDetailDto;
import com.ruoyi.ur.domain.entity.Order;
import com.ruoyi.ur.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    @Anonymous
    public AjaxResult getOrderDetail(@PathVariable String id) {
        OrderDetailDto detail = orderService.getOrderDetailById(id);
        return AjaxResult.success(detail);
    }
}