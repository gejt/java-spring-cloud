package xyz.zao123.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author gejt
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OrderServiceBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(OrderServiceBootstrap.class, args);
    }
}
