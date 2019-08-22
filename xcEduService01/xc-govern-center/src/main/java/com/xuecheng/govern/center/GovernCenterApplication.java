package com.xuecheng.govern.center;/**
 * @author: lsm
 * @description:
 * @create: 2019-08-19 18:57
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 @author: ls
 @description:
 @create: 2019-08-19 18:57
 */
@EnableEurekaServer //标识此工程是一个EurekaServer
@SpringBootApplication
public class GovernCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(GovernCenterApplication.class,args);
    }
}
