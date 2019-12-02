package com.example.cloud.eurekacl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClApplication.class, args);
    }

}
