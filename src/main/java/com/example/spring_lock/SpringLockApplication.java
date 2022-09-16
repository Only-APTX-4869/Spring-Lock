package com.example.spring_lock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class SpringLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLockApplication.class, args);
    }

}
