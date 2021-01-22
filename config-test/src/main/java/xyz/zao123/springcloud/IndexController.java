package xyz.zao123.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gejt
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${test}")
    private String test;

    @GetMapping("/")
    public String index(){
        return test;
    }

}
