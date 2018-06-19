package com.bee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by mervin on 2018/6/13.
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注册进eureka服务
public class DeptProvider8001_App {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}
