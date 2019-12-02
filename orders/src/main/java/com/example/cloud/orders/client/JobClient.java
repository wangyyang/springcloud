package com.example.cloud.orders.client;

import com.example.cloud.commons.model.query.QueryStat;
import com.example.cloud.orders.service.impl.OrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "job-service",fallback = OrderServiceImpl.class)
public interface JobClient {

    @PostMapping(value = "/job/getJobList")
    Object getJobList(@RequestBody QueryStat queryStat);

    @PostMapping(value = "/job/getJobDetail")
    Object getJobDetail(@RequestParam Integer jobId);

}
