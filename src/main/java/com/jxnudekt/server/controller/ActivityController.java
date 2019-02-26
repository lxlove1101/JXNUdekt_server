package com.jxnudekt.server.controller;

import com.jxnudekt.server.entity.DimActivityType1Entity;
import com.jxnudekt.server.entity.DimActivityType2Entity;
import com.jxnudekt.server.entity.DimActivityType3Entity;
import com.jxnudekt.server.entity.FactActivityInfoEntity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimActivityType1Service;
import com.jxnudekt.server.service.DimActivityType2Service;
import com.jxnudekt.server.service.DimActivityType3Service;
import com.jxnudekt.server.service.FactActivityInfoService;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-02-25 16:01
 **/
@Api(tags = "ActivityController", description = "活动相关接口")
@RestController
@RequestMapping("/API")
public class ActivityController {
    @Autowired
    private DimActivityType1Service type1Service;
    @Autowired
    private DimActivityType2Service type2Service;
    @Autowired
    private DimActivityType3Service type3Service;
    @Autowired
    private FactActivityInfoService activityInfoService;

    @ApiOperation(value = "查询所有活动分类信息", notes = "查询所有活动分类信息")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE_INFO", method = RequestMethod.GET)
    public ResultModel queryActivityType() {
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1All();
            List<DimActivityType2Entity> type2Entities = type2Service.findDimActivityType2All();
            List<DimActivityType3Entity> type3Entities = type3Service.findDimActivityType3All();
            for (DimActivityType2Entity item2 : type2Entities) {
                for (DimActivityType3Entity item3 : type3Entities) {
                    if (item2.getId().equals(item3.getType2id())) {
                        item2.addType3List(item3);
                    }
                }
            }
            for (DimActivityType1Entity item1 : type1Entities) {
                for (DimActivityType2Entity item2 : type2Entities) {
                    if (item1.getId().equals(item2.getType1id())) {
                        item1.addType2List(item2);
                    }
                }
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据条件查询活动信息", notes = "根据条件查询活动信息")
    @ApiImplicitParam(name = "activityInfoEntity", value = "活动信息对象Map", required = true, dataType = "FactActivityInfoEntity", paramType = "body")
    @RequestMapping(value = "/QUERY_ACTIVITY_BY_CONDITION", method = RequestMethod.POST)
    public ResultModel queryActivityInfoByCondition(@RequestBody FactActivityInfoEntity activityInfoEntity) {
        try {
            List<FactActivityInfoEntity> activityInfoEntities = activityInfoService.findFactActivityInfoByCondition(activityInfoEntity);
            if (activityInfoEntities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("content", activityInfoEntities);
            return ResultTool.result("SUCCESS", "", resultMap);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

}
