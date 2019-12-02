package com.example.cloud.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.commons.entity.Job;
import com.example.cloud.commons.model.query.QueryStat;

import java.util.List;

public interface JobService extends IService<Job> {

    List<Job> getJobList(QueryStat queryStat);
}
