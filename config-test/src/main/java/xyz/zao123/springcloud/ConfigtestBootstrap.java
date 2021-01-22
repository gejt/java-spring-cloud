package xyz.zao123.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class ConfigtestBootstrap {

//    @Value("${test}")
//    private String test;
//
//    @GetMapping("/")
//    public String index(){
//        return test;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigtestBootstrap.class,args);
    }

}
