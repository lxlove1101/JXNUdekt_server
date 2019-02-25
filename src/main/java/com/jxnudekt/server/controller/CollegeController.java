package com.jxnudekt.server.controller;

import com.jxnudekt.server.entity.DimCollegeEntity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimCollegeService;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-02-26 01:03
 **/
@Api(tags = "CollegeController", description = "学院信息相关接口")
@RestController
@RequestMapping("/API")
public class CollegeController {
    @Autowired
    private DimCollegeService collegeService;

    @ApiOperation(value = "查询所有学院基本信息", notes = "查询所有学院基本信息")
    @RequestMapping(value = "/QUERY_COLLEGE_BY_ALL", method = RequestMethod.GET)
    public ResultModel findDimActivityType1All() {
        try {
            List<DimCollegeEntity> collegeEntities = collegeService.findDimCollegeAll();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", collegeEntities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }
}
