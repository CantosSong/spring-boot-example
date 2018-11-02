package com.songmengmeng.example.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String sayHello(String username) {
        logger.info("sayHello,{}",username);
        return username;
    }
}