package com.example.cloud.commons.api.wx.wechat;

import lombok.Data;

@Data
public class CreateQrCode {
    private String scene;
    private String page;
    private String width;
}
