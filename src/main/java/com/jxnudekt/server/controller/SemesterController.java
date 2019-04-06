package com.jxnudekt.server.controller;

import com.jxnudekt.server.entity.DimSemesterEntity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimSemesterService;
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

@Api(tags = "SemesterController", description = "学期相关接口")
@RestController
@RequestMapping("/API")
public class SemesterController {
    @Autowired
    private DimSemesterService dimSemesterService;

    @ApiOperation(value = "查询所有学期信息", notes = "查询所有学期信息")
    @RequestMapping(value = "/QUERY_SEMESTER", method = RequestMethod.GET)
    public ResultModel findDimSemester() {
        try {
            List<DimSemesterEntity> list = dimSemesterService.findDimSemesterAll();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", list);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }


}
