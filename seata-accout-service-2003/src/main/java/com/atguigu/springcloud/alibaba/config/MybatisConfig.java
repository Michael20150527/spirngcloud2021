package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MybatisConfig
 * @description:
 * @author: Michael Guan
 * @create: 2020-06-12 09:49
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MybatisConfig {
}
