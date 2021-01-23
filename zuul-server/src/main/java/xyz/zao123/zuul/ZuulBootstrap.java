package xyz.zao123.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author gejt
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ZuulBootstrap.class,args);
    }
}
