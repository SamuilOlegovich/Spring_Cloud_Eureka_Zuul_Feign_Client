package com.epam.deepthought;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class DeepThoughtApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeepThoughtApplication.class, args);
    }
}
