package com.example.jjuc_backend_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.jjuc_backend_demo.mapper")
public class JjucBackendDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjucBackendDemoApplication.class, args);
    }

}
