package xyz.zao123.springcloud.eurake;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(EurakeBootstrap.class,args);
    }
}
