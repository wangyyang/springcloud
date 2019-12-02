package com.example.cloud.orders.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.commons.entity.Orders;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderService extends IService<Orders> {

    PageInfo<Orders> getOrderList();
}
