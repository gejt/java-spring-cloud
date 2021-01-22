package xyz.zao123.springcloud.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gejt
 */

@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
public class ConfigBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ConfigBootstrap.class,args);
    }
}
