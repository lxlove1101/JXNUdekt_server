package com.jxnudekt.server.utils;

import com.jxnudekt.server.model.ResultModel;

import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: 请求结果处理工具类
 * @CreateDate: 2019-01-23 16:07
 **/
public class ResultTool {
    /**
     * 错误码记录：
     * SUCCESS--------成功0
     * PARAMETER_ERROR-----请求传参错误1001
     * CONTENT_EMPTY-----没有对应内容1002
     * USER_ALREADY_EXISTS-----此用户已存在1003
     * UPLOAD_FILE_EMPTY-----上传文件为空1004
     * NOT_FOUND------404异常抛出错误
     */
    /**
     * @param code--返回码
     * @param message---404服务器内部异常时提示消息(返回码不是404时传空即可)
     * @param map------数据源
     * @return com.jxnudekt.server.model.ResultModel
     */
    public static ResultModel result(String code, String message, Map<String, Object> map) {
        ResultModel model = new ResultModel();
        model.setCode(code);

        switch (code) {
            case "SUCCESS":
                model.setMessage("成功");
                if (map != null) {
                    model.setData(map);
                }
                break;
            case "PARAMETER_ERROR":
                model.setMessage("请求传参错误 ");
                break;
            case "CONTENT_EMPTY":
                model.setMessage("没有对应内容 ");
                break;
            case "USER_ALREADY_EXISTS":
                model.setMessage("此用户已存在");
                break;
            case "UPLOAD_FILE_EMPTY":
                model.setMessage("上传文件为空");
                break;
            case "NOT_FOUND":
                model.setMessage(message);
                break;
            default:
                model.setMessage("未知错误");
                break;
        }
        return model;
    }

}
