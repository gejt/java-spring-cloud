package xyz.zao123.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author gejt
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ZuulBootstrap.class,args);
    }

    /*@Bean
    public FallbackProvider defaulFallbackProvider(){
        return new DefaultFallbackProvider();
    }

    @Bean
    public FallbackProvider apiFallbackProvider(){
        return new MyFallbackProvider();
    }*/

    /**
     * 允许跨站访问
     * @return
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("https://www.baidu.com")
                        .allowedMethods("GET", "POST");
            }
        };
    }
}
