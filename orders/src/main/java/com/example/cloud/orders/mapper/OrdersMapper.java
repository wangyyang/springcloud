package com.example.cloud.orders.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.commons.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
