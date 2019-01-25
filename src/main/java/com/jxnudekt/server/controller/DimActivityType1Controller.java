package com.jxnudekt.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxnudekt.server.entity.DimActivityType1Entity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimActivityType1Service;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: -> 活动一级类Controller
 * @CreateDate: 2019-01-23 17:00
 **/
@Api(tags = "DimActivityType1Controller", description = "活动一级类")
@RestController
@RequestMapping("/API")
public class DimActivityType1Controller {
    @Autowired
    private DimActivityType1Service type1Service;

    @ApiOperation(value = "查询所有活动一级类信息", notes = "查询所有活动一级类信息")
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

    @ApiOperation(value = "分页查询活动一级类信息", notes = "分页查询活动一级类信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "查询的页数", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量大小", required = true, dataType = "Integer", paramType = "query")})
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE1_BY_PAGE", method = RequestMethod.GET)
    public ResultModel findDimActivityType1ByPage(@RequestParam Integer page, @RequestParam Integer pageSize) {
        try {
            if (page == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if (pageSize == null) {
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
    @ApiOperation(value = "根据条件查询活动一级类信息", notes = "根据条件查询活动一级类信息")
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
    @ApiOperation(value = "根据ids查询活动一级类信息", notes = "根据ids查询活动一级类信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Integer>", paramType = "body")
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

    @ApiOperation(value = "插入单个活动一级类信息", notes = "插入单个活动一级类信息")
    @ApiImplicitParam(name = "type1Entity", value = "一级类对象Map", required = true, dataType = "DimActivityType1Entity", paramType = "body")
//    @ApiResponse(code = 200, message = "添加成功")
    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE1_FOR_ONE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType1(@RequestBody DimActivityType1Entity type1Entity) {
        try {
            int code = type1Service.insertDimActivityType1(type1Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "插入多个活动一级类信息", notes = "插入多个活动一级类信息")
    @ApiImplicitParam(name = "list", value = "一级类数组对象List<DimActivityType1Entity>", required = true, dataType = "List<DimActivityType1Entity>", paramType = "body")
    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE1_FOR_MORE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType1s(@RequestBody List<DimActivityType1Entity> list) {
        try {
            int code = type1Service.insertDimActivityType1s(list);
            if (list.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json       Body: {"id": 1, "name": "思想成长修改", "tag": "A", "isValid": 0}
    @ApiOperation(value = "更新单个活动一级类信息", notes = "更新单个活动一级类信息")
    @ApiImplicitParam(name = "type1Entity", value = "一级类对象Map", required = true, dataType = "DimActivityType1Entity", paramType = "body")
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE1_FOR_ONE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType1(@RequestBody DimActivityType1Entity type1Entity) {
        try {
            int code = type1Service.updateDimActivityType1(type1Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json       Body: [{"id": 1, "name": "思想成长修改", "tag": "AA", "isValid": 0 }, { "id": 2, "name": "实践学习修改", "tag": "B", "isValid": 0}]
    @ApiOperation(value = "更新多个活动一级类信息", notes = "更新多个活动一级类信息")
    @ApiImplicitParam(name = "list", value = "一级类数组对象List<DimActivityType1Entity>", required = true, dataType = "List<DimActivityType1Entity>", paramType = "body")
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE1_FOR_MORE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType1s(@RequestBody List<DimActivityType1Entity> list) {
        try {
            int code = type1Service.updateDimActivityType1s(list);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    //Content-Type = application/json     Body: 5
    @ApiOperation(value = "删除单个活动一级类信息", notes = "删除单个活动一级类信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "body")
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
    @ApiOperation(value = "删除多个活动一级类信息", notes = "删除多个活动一级类信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Integer>", paramType = "body")
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
