package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.test.dao")
@EnableOpenApi
public class TkMybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisTestApplication.class, args);
    }

}
