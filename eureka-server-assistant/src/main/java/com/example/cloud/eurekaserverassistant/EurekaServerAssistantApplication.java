package com.example.cloud.eurekaserverassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAssistantApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAssistantApplication.class, args);
    }

}
