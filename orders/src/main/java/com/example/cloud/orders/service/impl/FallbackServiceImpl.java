package com.example.cloud.orders.service.impl;

import com.example.cloud.commons.model.ApiResult;
import com.example.cloud.orders.service.FallbackService;
import org.springframework.stereotype.Service;

@Service
public class FallbackServiceImpl implements FallbackService {

    @Override
    public Object error() {
        return ApiResult.error("请求错误，请联系客服");
    }
}
