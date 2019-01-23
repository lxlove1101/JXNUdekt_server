package com.jxnudekt.server.controller;

import com.jxnudekt.server.entity.DimActivityType1Entity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimActivityType1Service;
import com.jxnudekt.server.utils.ResultTool;
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
@RestController
@RequestMapping("/API")
public class DimActivityType1Controller {
    @Autowired
    private DimActivityType1Service type1Service;

    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_ALL", method = RequestMethod.GET)
    public ResultModel findDimActivityType1All(){
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1All();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        }catch (Exception e){
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json       Body: { "id": 1, "name": "思想成长", "tag": "A"}
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_CONDITION", method = RequestMethod.POST)
    public ResultModel findDimActivityType1ByCondition(@RequestBody DimActivityType1Entity type1Entity){
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1ByCondition(type1Entity);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json     Body: [1, 2, 3]
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_IDS", method = RequestMethod.POST)
    public ResultModel findDimActivityType1ByIds(@RequestBody List<Long> ids){
        try {
            List<DimActivityType1Entity> type1Entities = type1Service.findDimActivityType1ByIds(ids);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type1Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }


//    public List<DimActivityType1Entity> findDimActivityType1All();
//    public List<DimActivityType1Entity> findDimActivityType1ByCondition(Map type1);
//    public List<DimActivityType1Entity> findDimActivityType1ByIds(List<Long> ids);
//    public int insertDimActivityType1(DimActivityType1Entity type1Entity);
//    public int insertDimActivityType1s(List<DimActivityType1Entity> list);
//    public int updateDimActivityType1(DimActivityType1Entity type1Entity);
//    public int updateDimActivityType1s(List<DimActivityType1Entity> list);
//    public int deleteDimActivityType1ById(Long id);
//    public int deleteDimActivityType1ByIds(List<Long> ids);


}
