package xyz.zao123.springcloud.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author gejt
 */

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ConfigBootstrap.class,args);
    }
}
