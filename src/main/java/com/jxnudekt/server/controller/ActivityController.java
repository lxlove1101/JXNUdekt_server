package com.jxnudekt.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxnudekt.server.entity.*;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.*;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private ActivityStuCommitService activityStuCommitService;

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
    @RequestMapping(value = "/QUERY_ACTIVITY_BY_CONDITION", method = RequestMethod.POST)
    public ResultModel queryActivityInfoByCondition(@RequestBody Map bodyMap) {
        try {
            Integer page = (Integer) bodyMap.get("page");
            Integer pageSize = (Integer) bodyMap.get("pageSize");
            if (page == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if (pageSize == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            PageHelper.startPage(page, pageSize);
            List<FactActivityInfoEntity> activityInfoEntities = activityInfoService.findFactActivityInfoByCondition(bodyMap);
            if (activityInfoEntities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            PageInfo<FactActivityInfoEntity> pageInfo = new PageInfo<>(activityInfoEntities);
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("content", pageInfo);
            return ResultTool.result("SUCCESS", "", resultMap);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据活动id或者名称查询活动信息", notes = "根据活动id或者名称查询活动信息")
    @RequestMapping(value = "/QUERY_ACTIVITY_DETAIL_BY_TYPEID", method = RequestMethod.POST)
    public ResultModel queryActivityDetailByTypeId(@RequestBody Map bodyMap) {
        try {
            Integer page = (Integer) bodyMap.get("page");
            Integer pageSize = (Integer) bodyMap.get("pageSize");
            if (page == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if (pageSize == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            PageHelper.startPage(page, pageSize);
            List<FactActivityDetailEntity> activityInfoEntities = activityInfoService.findFactActivityDetailByTypeId(bodyMap);
            PageInfo<FactActivityDetailEntity> pageInfo = new PageInfo<>(activityInfoEntities);
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("content", pageInfo);
            return ResultTool.result("SUCCESS", "", resultMap);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "学生提交申报活动", notes = "学生提交申报活动")
    @RequestMapping(value = "/COMMIT_ACTIVITY", method = RequestMethod.POST)
    public ResultModel saveStuCommitActivities(@RequestBody Map bodyMap){
        try {
            String userId = bodyMap.get("userId").toString();
            List<Long> ids = (List<Long>) bodyMap.get("activityIds");
            int code = activityStuCommitService.insertActivityStuCommits(userId, ids);
            if(ids.size() == code){
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        }catch(Exception e){
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "查询活动具体信息", notes = "根据id查询活动具体信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/QUERY_ACTIVITY_DETAIL_BY_ID/{id}", method = RequestMethod.GET)
    public ResultModel findActivityDetailById(@PathVariable String id) {
        try {
            FactActivityDetailEntity result = activityInfoService.findFactActivityDetailById(Long.parseLong(id));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", result);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

}
