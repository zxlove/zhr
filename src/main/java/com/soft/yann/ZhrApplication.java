package com.soft.yann;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soft.yann.mapper")
public class ZhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhrApplication.class, args);
    }

}
