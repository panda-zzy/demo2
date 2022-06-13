package com.example.ssmp_demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.ssmp_demo.dao","com.example.ssmp_demo.generator.mapper"})
public class SsmpDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SsmpDemoApplication.class, args);

    }

}
