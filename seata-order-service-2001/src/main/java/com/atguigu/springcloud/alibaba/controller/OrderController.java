package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.entity.CommonResult;
import com.atguigu.springcloud.alibaba.entity.Order;
import com.atguigu.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className: OrderController
 * @description:
 * @author: Michael Guan
 * @create: 2020-06-12 10:28
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
