package com.example.cloud.job.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.cloud.commons.entity.Job;
import com.example.cloud.commons.model.query.QueryStat;
import com.example.cloud.commons.util.MapUtils;
import com.example.cloud.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("job")
@RefreshScope
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("getJobList")
    public Object getJobList(@RequestBody QueryStat queryStat) {
        if (queryStat.getStatus() == 1) {
            Map map = MapUtils.create("asdkf", "asdkf", "kasdlfa", "asdfas");
            return map;
        } else {
            return jobService.getJobList(queryStat);
        }
    }

    @PostMapping("getJobDetail")
    public Object getJobDetail(Integer jobId) {
        return jobService.getById(jobId);
    }
}
