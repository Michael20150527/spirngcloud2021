package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @className: PyamentFallbackService
 * @description:
 * @author: Michael Guan
 * @create: 2020-06-10 17:33
 */

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
