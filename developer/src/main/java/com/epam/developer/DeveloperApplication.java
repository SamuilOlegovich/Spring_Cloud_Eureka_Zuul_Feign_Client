package com.epam.developer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients(clients = DeepThoughtClient.class)
public class DeveloperApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeveloperApplication.class, args);
    }
}
