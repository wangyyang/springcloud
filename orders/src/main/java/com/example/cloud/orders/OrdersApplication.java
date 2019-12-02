package com.example.cloud.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients     //表示我可以调用其他服务，如果一个服务想要调用其他服务，则必须加上此注解
@SpringCloudApplication //注解就代替了springbootapplication注解以及eureka注解和熔断器的注解
public class OrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }

}
