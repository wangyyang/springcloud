package com.example.cloud.orders.controller;

import com.example.cloud.orders.service.FallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fallback")
public class FallbackController {

    @Autowired
    private FallbackService fallbackService;

    @PostMapping("error")
    public Object error() {
        return fallbackService.error();
    }
}
