package com.jxnudekt.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxnudekt.server.entity.DimActivityType3Entity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimActivityType3Service;
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
 * @CreateDate: 2019-01-25 23:28
 **/
@Api(tags = "DimActivityType3Controller", description = "活动三级类")
@RestController
@RequestMapping("/API")
public class DimActivityType3Controller {
    @Autowired
    private DimActivityType3Service type3Service;

    @ApiOperation(value = "查询所有活动三级类信息", notes = "查询所有活动三级类信息")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE3_BY_ALL", method = RequestMethod.GET)
    public ResultModel findDimActivityType3All() {
        try {
            List<DimActivityType3Entity> type3Entities = type3Service.findDimActivityType3All();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type3Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "分页查询活动三级类信息", notes = "分页查询活动三级类信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "查询的页数", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量大小", required = true, dataType = "Integer", paramType = "query")})
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE3_BY_PAGE", method = RequestMethod.GET)
    public ResultModel findDimActivityType3ByPage(@RequestParam Integer page, @RequestParam Integer pageSize) {
        try {
            if (page == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if (pageSize == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            PageHelper.startPage(page, pageSize);
            List<DimActivityType3Entity> type3Entities = type3Service.findDimActivityType3All();
            PageInfo<DimActivityType3Entity> pageInfo = new PageInfo<>(type3Entities);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pageInfo", pageInfo);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据条件查询活动三级类信息", notes = "根据条件查询活动三级类信息")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE3_BY_CONDITION", method = RequestMethod.GET)
    public ResultModel findDimActivityType3ByCondition(DimActivityType3Entity type3Entity) {
        try {
            List<DimActivityType3Entity> type3Entities = type3Service.findDimActivityType3ByCondition(type3Entity);
            if (type3Entities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type3Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据ids查询活动三级类信息", notes = "根据ids查询活动三级类信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Integer>", paramType = "body")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE3_BY_IDS", method = RequestMethod.POST)
    public ResultModel findDimActivityType3ByIds(@RequestBody List<Integer> ids) {
        try {
            List<DimActivityType3Entity> type3Entities = type3Service.findDimActivityType3ByIds(ids);
            if (type3Entities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type3Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "插入单个活动三级类信息", notes = "插入单个活动三级类信息")
    @ApiImplicitParam(name = "type3Entity", value = "三级类对象Map", required = true, dataType = "DimActivityType3Entity", paramType = "body")
    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE3_FOR_ONE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType3(@RequestBody DimActivityType3Entity type3Entity) {
        try {
            int code = type3Service.insertDimActivityType3(type3Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "插入多个活动三级类信息", notes = "插入多个活动三级类信息")
    @ApiImplicitParam(name = "list", value = "三级类数组对象List<DimActivityType3Entity>", required = true, dataType = "List<DimActivityType3Entity>", paramType = "body")
    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE3_FOR_MORE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType3s(@RequestBody List<DimActivityType3Entity> list) {
        try {
            int code = type3Service.insertDimActivityType3s(list);
            if (list.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "更新单个活动三级类信息", notes = "更新单个活动三级类信息")
    @ApiImplicitParam(name = "type3Entity", value = "三级类对象Map", required = true, dataType = "DimActivityType3Entity", paramType = "body")
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE3_FOR_ONE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType3(@RequestBody DimActivityType3Entity type3Entity) {
        try {
            int code = type3Service.updateDimActivityType3(type3Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "更新多个活动三级类信息", notes = "更新多个活动三级类信息")
    @ApiImplicitParam(name = "list", value = "三级类数组对象List<DimActivityType3Entity>", required = true, dataType = "List<DimActivityType3Entity>", paramType = "body")
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE3_FOR_MORE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType3s(@RequestBody List<DimActivityType3Entity> list) {
        try {
            int code = type3Service.updateDimActivityType3s(list);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "删除单个活动三级类信息", notes = "删除单个活动三级类信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "body")
    @RequestMapping(value = "/DELETE_ACTIVITY_TYPE3_BY_ID", method = RequestMethod.POST)
    public ResultModel deleteDimActivityType3ById(@RequestBody String id) {
        try {
            int code = type3Service.deleteDimActivityType3ById(Integer.parseInt(id));
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "删除多个活动三级类信息", notes = "删除多个活动三级类信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Integer>", paramType = "body")
    @RequestMapping(value = "/DELETE_ACTIVITY_TYPE3_BY_IDS", method = RequestMethod.POST)
    public ResultModel deleteDimActivityType3ByIds(@RequestBody List<Integer> ids) {
        try {
            int code = type3Service.deleteDimActivityType3ByIds(ids);
            if (ids.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);

        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }
}
