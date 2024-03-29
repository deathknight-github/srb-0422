package com.atguigu.srb.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@SpringBootApplication
@MapperScan("com.atguigu.srb.core.mapper")
@ComponentScan({"com.atguigu.srb", "com.atguigu.common"})
public class ServiceCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class,args);
    }
}
