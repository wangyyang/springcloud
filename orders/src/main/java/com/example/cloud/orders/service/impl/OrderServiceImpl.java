package com.example.cloud.orders.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.commons.entity.Orders;
import com.example.cloud.orders.mapper.OrdersMapper;
import com.example.cloud.orders.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrderService {

    @Override
    public PageInfo<Orders> getOrderList() {
        PageHelper.startPage(1, 10);
        LambdaQueryWrapper<Orders> lq = new LambdaQueryWrapper<>();
        lq.eq(Orders::getFacId, 99);
        List<Orders> list = baseMapper.selectList(lq);
        PageInfo<Orders> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
