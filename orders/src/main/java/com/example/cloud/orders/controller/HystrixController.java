package com.example.cloud.orders.controller;

import com.example.cloud.commons.model.ApiResult;
import com.example.cloud.orders.client.JobClient;
import com.example.cloud.orders.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hystrix")
public class HystrixController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private JobClient jobClient;

    @HystrixCommand(fallbackMethod = "com.example.cloud.orders.controller.error")
    @PostMapping("getOrderList")
    public Object getOrderList(Integer status){
        if (status==1) {
            return orderService.getOrderList();
        }else
            return jobClient.getJobDetail(status);
    }

    /**
     * 方法名,返回值一致就行了
     */
    public String errorHandle() {
        return "服务器忙,请售后重试";
    }
}
