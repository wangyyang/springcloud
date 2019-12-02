package com.example.cloud.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class ChatRecords {
    @TableId(type = IdType.AUTO)
    private int id;
    private String chatId;
    private String content;
    private Date createTime;
}
