package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: MainAppConfigCenter3344
 * @description:
 * 运维人员手动发送Post请求刷新3344配置中心，所有的客户端将会自动更新，命令如下：
 * curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * 定点更新：curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
 * @author: Michael Guan
 * @create: 2020/3/9 16:28
 **/
@SpringBootApplication
@EnableConfigServer
public class MainConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(MainConfigCenter3344.class, args);
    }
}
