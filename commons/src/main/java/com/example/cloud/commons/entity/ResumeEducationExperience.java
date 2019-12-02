package com.example.cloud.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class ResumeEducationExperience {
    @TableId(type = IdType.AUTO)
    private int id;
    private Integer rsmId;
    private String schoolName;
    private String major;
    private Integer education;
    private Integer associateEnrolled;
    private Date startTime;
    private Date endTime;
    private Date createTime;
    private Date updateTime;
}
