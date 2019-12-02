package com.example.cloud.job.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.commons.entity.Job;
import com.example.cloud.commons.model.query.QueryStat;
import com.example.cloud.job.mapper.JobMapper;
import com.example.cloud.job.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService {

    @Override
    public List<Job> getJobList(QueryStat queryStat) {
        LambdaQueryWrapper<Job> lq = new LambdaQueryWrapper<>();
        lq.eq(Job::getStatus, 2);
        List<Job> list = baseMapper.selectList(lq);
        return list;
    }
}
