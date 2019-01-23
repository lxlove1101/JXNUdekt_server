package com.jxnudekt.server.model;

import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: 返回的数据格式model
 * @CreateDate: 2019-01-23 16:08
 **/
public class ResultModel {
    private String code;    // 返回码
    private String message;  // 返回消息
    private Map<String, Object> data;   // 数据源

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}
