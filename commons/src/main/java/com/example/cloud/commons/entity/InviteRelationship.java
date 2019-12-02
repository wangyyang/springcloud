package com.example.cloud.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class InviteRelationship {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer inviter;
    private Integer invitee;
    private Date invitationTime;
}
