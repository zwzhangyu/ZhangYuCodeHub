package com.zy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringRetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRetryApplication.class, args);
    }

}
