package com.atguigu.springcloud.alibaba.service;

/**
 * @className: StorageService
 * @description:
 * @author: Michael Guan
 * @create: 2020-06-12 10:23
 */


public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
