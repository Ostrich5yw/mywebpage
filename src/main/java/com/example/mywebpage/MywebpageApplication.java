package com.example.mywebpage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mywebpage.dao")
public class MywebpageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebpageApplication.class, args);
    }

}
