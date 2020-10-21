package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.test.dao")
public class TkMybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisTestApplication.class, args);
    }

}
