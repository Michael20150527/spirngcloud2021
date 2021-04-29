package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @description: 配置类
 * @author: Michael Guan
 * @create: 2020/3/5 21:25
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced//开启负载均衡，通过微服务名称调用微服务
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
