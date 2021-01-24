package xyz.zao123.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import xyz.zao123.zuul.fallback.DefaultFallbackProvider;
import xyz.zao123.zuul.fallback.MyFallbackProvider;

/**
 * @author gejt
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ZuulBootstrap.class,args);
    }

    @Bean
    public FallbackProvider defaulFallbackProvider(){
        return new DefaultFallbackProvider();
    }

    @Bean
    public FallbackProvider apiFallbackProvider(){
        return new MyFallbackProvider();
    }
}
