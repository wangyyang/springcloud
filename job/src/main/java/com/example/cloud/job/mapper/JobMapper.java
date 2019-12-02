package com.example.cloud.job.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.commons.entity.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobMapper extends BaseMapper<Job> {
}
