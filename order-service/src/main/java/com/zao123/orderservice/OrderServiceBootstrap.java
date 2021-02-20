package com.zao123.orderservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author gejt
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.zao123.orderservice.mapper")
public class OrderServiceBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(OrderServiceBootstrap.class, args);
    }
}
