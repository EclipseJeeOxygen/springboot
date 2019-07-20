package com.springboot;

import com.netty.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

/**
 * @Author lujiaming
 * @Date 2019/5/21
 * @Description
 **/
@SpringBootApplication
public class SpringbootApplication  {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootApplication.class, args);
//        NettyServer.start();
    }

}
