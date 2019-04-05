package com.jxnudekt.server.controller;

import com.jxnudekt.server.entity.FeedbackUserCommitEntity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.FeedbackUserCommitService;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "FeedbackUserCommitController", description = "反馈意见相关接口")
@RestController
@RequestMapping("/API")
public class FeedbackUserCommitController {

    @Autowired
    private FeedbackUserCommitService feedbackUserCommitService;

    @ApiOperation(value = "学生提交反馈信息", notes = "学生提交反馈信息")
    @RequestMapping(value = "/COMMIT_FEEDBACK", method = RequestMethod.POST)
    public ResultModel insertFeedbackUserCommit(@RequestBody Map bodyMap) {
        try {
            int code = feedbackUserCommitService.insertFeedbackUserCommit(bodyMap);
            if (1 == code){
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据用户Id查询用户所反馈的信息", notes = "根据用户Id查询用户所反馈的信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/QUERY_FEEDBACK_BY_USERID/{id}", method = RequestMethod.GET)
    public ResultModel findActivityDetailById(@PathVariable String id) {
        try {
            List<FeedbackUserCommitEntity> result = feedbackUserCommitService.findFeedbackUserCommitByUserId(Long.parseLong(id));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", result);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }


}
