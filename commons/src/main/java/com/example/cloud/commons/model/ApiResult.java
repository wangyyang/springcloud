package com.example.cloud.commons.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ApiResult {
    private Integer code;
    private String msg;
    private Object data;

    public static ApiResult success() {
        return new ApiResult().setCode(2000).setMsg("成功");
    }

    public static ApiResult success(String msg) {
        return new ApiResult().setCode(2000).setMsg(msg);
    }

    public static ApiResult error() {
        return new ApiResult().setCode(5000).setMsg("失败");
    }

    public static ApiResult error(String msg) {
        return new ApiResult().setCode(5000).setMsg(msg);
    }
}
