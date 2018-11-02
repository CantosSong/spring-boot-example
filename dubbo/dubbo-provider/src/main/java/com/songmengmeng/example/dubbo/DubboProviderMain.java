package com.songmengmeng.example.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Cantos Song created on 2018/11/2
 * @version $Id$
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(DubboProviderMain.class).web(WebApplicationType.NONE).run(args);
    }
}
