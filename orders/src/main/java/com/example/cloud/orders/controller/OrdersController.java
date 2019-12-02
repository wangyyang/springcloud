package com.example.cloud.orders.controller;

import com.example.cloud.commons.model.query.QueryStat;
import com.example.cloud.orders.client.JobClient;
import com.example.cloud.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
@RefreshScope //开启更新功能
public class OrdersController {

    @Autowired
    private JobClient jobClient;
    @Autowired
    private OrderService orderService;


    @PostMapping("getJobList")
    public Object getJobList(QueryStat queryStat) {
        return jobClient.getJobList(queryStat);
    }

    @PostMapping("getJobDetail")
    public Object getJobDetail(QueryStat queryStat){
        return jobClient.getJobDetail(queryStat.getJobId());
    }

    @PostMapping("getOrderList")
    public Object getOrderList() {
        return orderService.getOrderList();
    }


}
