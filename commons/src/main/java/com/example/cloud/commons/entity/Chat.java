package com.example.cloud.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Chat {
    @TableId(type = IdType.AUTO)
    private int id;
    private Integer facUserId;
    private Integer userId;
    private Integer orderId;
    private Integer exchangePhone;
    private Date chatLastTime;
}
