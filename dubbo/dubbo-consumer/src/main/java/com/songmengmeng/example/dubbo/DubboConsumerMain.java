package com.songmengmeng.example.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.songmengmeng.example.dubbo.service.IHelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cantos Song created on 2018/11/2
 * @version $Id$
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerMain.class, args);
    }

    @RestController
    public class TestController {
        @Reference(url = "dubbo://127.0.0.1:20880")
        private IHelloService helloService;
        @GetMapping("test")
        public String sayHello(String username){
            return helloService.sayHello(username);
        }
    }
}
