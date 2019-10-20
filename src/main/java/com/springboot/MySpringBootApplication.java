package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 3.要通过SpringBoot提供的引导类起步SpringBoot才可以进行访问
 */
@SpringBootApplication // 3.1 声明该类是一个springboot引导类
public class MySpringBootApplication {

    // 3.2 main是java程序入口
    public static void main(String[] args) {
        // 3.3 run方法表示运行springboot的引导类，参数是带有引导类注解的类的字节码
        SpringApplication.run(MySpringBootApplication.class);
    }
}
