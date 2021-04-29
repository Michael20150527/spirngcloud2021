package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName: PaymentController
 * @description:
 * @author: Michael Guan
 * @create: 2020/3/6 15:45
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String SERVER_PORT;

    @RequestMapping("/consul")
    public String paymentConsul() {
        return "com.com.springcloud with consul :" + SERVER_PORT + "\t" + UUID.randomUUID().toString();
    }
}
