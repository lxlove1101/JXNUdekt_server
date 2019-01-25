package com.jxnudekt.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxnudekt.server.entity.DimActivityType1Entity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimActivityType1Service;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: ->
 * @CreateDate: 2019-01-23 17:00
 **/
@Api(tags = "DimActivityType1Controller", description = "活动一级类")
@RestController
@RequestMapping("/API")
public class DimActivityType1Controller {
    @Autowired
    private DimActivityType1Service type1Service;

    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_ALL", method = RequestMethod.GET)
    public ResultModel findDimActivityType1All() {
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1All();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_PAGE", method = RequestMethod.GET)
    public ResultModel findDimActivityType1ByPage(@RequestParam Integer page, @RequestParam Integer pageSize){
        try {
            if(page == null){
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if(pageSize == null){
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            PageHelper.startPage(page, pageSize);
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1All();
            PageInfo<DimActivityType1Entity> pageInfo = new PageInfo<>(type1Entities);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pageInfo", pageInfo);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    // url?id=1&tag=A
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_CONDITION", method = RequestMethod.GET)
    public ResultModel findDimActivityType1ByCondition(DimActivityType1Entity type1Entity) {
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1ByCondition(type1Entity);
            if (type1Entities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json     Body: [2, 3, 7]
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_IDS", method = RequestMethod.POST)
    public ResultModel findDimActivityType1ByIds(@RequestBody List<Integer> ids) {
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1ByIds(ids);
            if (type1Entities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE1_FOR_ONE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType1(@RequestBody DimActivityType1Entity type1Entity){
        try{
            int code = type1Service.insertDimActivityType1(type1Entity);
            if(1 == code){
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        }catch (Exception e){
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE1_FOR_MORE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType1s(@RequestBody List<DimActivityType1Entity> list){
        try{
            int code = type1Service.insertDimActivityType1s(list);
            if(list.size() == code){
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        }catch (Exception e){
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json       Body: {"id": 1, "name": "思想成长修改", "tag": "A", "isValid": 0}
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE1_FOR_ONE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType1(@RequestBody DimActivityType1Entity type1Entity){
        try {
            int code = type1Service.updateDimActivityType1(type1Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        }catch (Exception e){
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json       Body: [{"id": 1, "name": "思想成长修改", "tag": "AA", "isValid": 0 }, { "id": 2, "name": "实践学习修改", "tag": "B", "isValid": 0}]
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE1_FOR_MORE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType1s(@RequestBody List<DimActivityType1Entity> list){
        try{
            int code = type1Service.updateDimActivityType1s(list);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        }catch (Exception e){
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json     Body: 5
    @RequestMapping(value = "/DELETE_ACTIVITY_TYPE1_BY_ID", method = RequestMethod.POST)
    public ResultModel deleteDimActivityType1ById(@RequestBody String id) {
        try {
            int code = type1Service.deleteDimActivityType1ById(Integer.parseInt(id));
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json     Body: [2, 3, 7]
    @RequestMapping(value = "/DELETE_ACTIVITY_TYPE1_BY_IDS", method = RequestMethod.POST)
    public ResultModel deleteDimActivityType1ByIds(@RequestBody List<Integer> ids) {
        try {
            int code = type1Service.deleteDimActivityType1ByIds(ids);
            if (ids.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);

        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

}
