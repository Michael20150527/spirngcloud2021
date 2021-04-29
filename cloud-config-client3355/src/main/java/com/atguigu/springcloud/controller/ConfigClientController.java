package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *怎样解决分布式配置动态刷新的问题，避免每次更新配置都要重启客户端微服务3355？
 * 解释：Github上的配置文件被更改后，3355不能动态的得到Github上更新的内容。
 * 步骤：
 * 1. pom.xml引入actuator监控。
 * 2. 修改yml，暴露监控端口:
 * management:
 *   endpoints:
 *     web:
 *       exposure:
 *         include: "*"
 * 3. 业务类上添加@RefreshScope，动态刷新业务类。
 * 4. 要想以上起效，需要运维人员手动发送Post请求刷新3355，命令如下：
 * curl -X POST "http://localhost:3355/actuator/refresh"
 *
 * 仍然存在的问题？
 * 1. 多个微服务客户端，如3355、3366、3377，要针对每个客户端都执行一次刷新命令吗？
 * 2. 如果有100个客户端，有30个需要刷新，怎么办？
 *
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
