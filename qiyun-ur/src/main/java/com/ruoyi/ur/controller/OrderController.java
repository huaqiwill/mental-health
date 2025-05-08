package com.ruoyi.ur.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ur.domain.entity.Order;
import com.ruoyi.ur.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public AjaxResult getById(@PathVariable String id) {
        return success(orderService.getById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Order order) {
        return success(orderService.insert(order));
    }
}