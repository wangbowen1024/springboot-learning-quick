package com.springboot;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 基于注解的mybatis-boot整合
 */
@SpringBootApplication
@MapperScan(basePackages = "com.springboot.mapper") // mapper注解扫包
public class SpringbootApplication {

    public static void main(String[] args) throws MqttException {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
