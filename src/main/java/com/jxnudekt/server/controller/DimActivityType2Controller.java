package com.jxnudekt.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxnudekt.server.entity.DimActivityType2Entity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.DimActivityType2Service;
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
 * @CreateDate: 2019-01-25 17:52
 **/
@Api(tags = "DimActivityType2Controller", description = "活动二级类")
@RestController
@RequestMapping("/API")
public class DimActivityType2Controller {
    @Autowired
    private DimActivityType2Service type2Service;

    @ApiOperation(value = "查询所有活动二级类信息", notes = "查询所有活动二级类信息")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE2_BY_ALL", method = RequestMethod.GET)
    public ResultModel findDimActivityType2All() {
        try {
            List<DimActivityType2Entity> type2Entities = type2Service.findDimActivityType2All();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type2Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "分页查询活动二级类信息", notes = "分页查询活动二级类信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "查询的页数", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量大小", required = true, dataType = "Integer", paramType = "query")})
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE2_BY_PAGE", method = RequestMethod.GET)
    public ResultModel findDimActivityType2ByPage(@RequestParam Integer page, @RequestParam Integer pageSize) {
        try {
            if (page == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if (pageSize == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            PageHelper.startPage(page, pageSize);
            List<DimActivityType2Entity> type2Entities = type2Service.findDimActivityType2All();
            PageInfo<DimActivityType2Entity> pageInfo = new PageInfo<>(type2Entities);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pageInfo", pageInfo);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据条件查询活动二级类信息", notes = "根据条件查询活动二级类信息")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE2_BY_CONDITION", method = RequestMethod.GET)
    public ResultModel findDimActivityType2ByCondition(DimActivityType2Entity type2Entity) {
        try {
            List<DimActivityType2Entity> type2Entities = type2Service.findDimActivityType2ByCondition(type2Entity);
            if (type2Entities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type2Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据ids查询活动二级类信息", notes = "根据ids查询活动二级类信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Integer>", paramType = "body")
    @RequestMapping(value = "/QUERY_ACTIVITY_TYPE2_BY_IDS", method = RequestMethod.POST)
    public ResultModel findDimActivityType2ByIds(@RequestBody List<Integer> ids) {
        try {
            List<DimActivityType2Entity> type2Entities = type2Service.findDimActivityType2ByIds(ids);
            if (type2Entities.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", type2Entities);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "插入单个活动二级类信息", notes = "插入单个活动二级类信息")
    @ApiImplicitParam(name = "type2Entity", value = "二级类对象Map", required = true, dataType = "DimActivityType2Entity", paramType = "body")
    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE2_FOR_ONE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType2(@RequestBody DimActivityType2Entity type2Entity) {
        try {
            int code = type2Service.insertDimActivityType2(type2Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "插入多个活动二级类信息", notes = "插入多个活动二级类信息")
    @ApiImplicitParam(name = "list", value = "二级类数组对象List<DimActivityType2Entity>", required = true, dataType = "List<DimActivityType2Entity>", paramType = "body")
    @RequestMapping(value = "/INSERT_ACTIVITY_TYPE2_FOR_MORE", method = RequestMethod.POST)
    public ResultModel insertDimActivityType2s(@RequestBody List<DimActivityType2Entity> list) {
        try {
            int code = type2Service.insertDimActivityType2s(list);
            if (list.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "更新单个活动二级类信息", notes = "更新单个活动二级类信息")
    @ApiImplicitParam(name = "type2Entity", value = "二级类对象Map", required = true, dataType = "DimActivityType2Entity", paramType = "body")
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE2_FOR_ONE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType2(@RequestBody DimActivityType2Entity type2Entity) {
        try {
            int code = type2Service.updateDimActivityType2(type2Entity);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "更新多个活动二级类信息", notes = "更新多个活动二级类信息")
    @ApiImplicitParam(name = "list", value = "二级类数组对象List<DimActivityType2Entity>", required = true, dataType = "List<DimActivityType2Entity>", paramType = "body")
    @RequestMapping(value = "/UPDATE_ACTIVITY_TYPE2_FOR_MORE", method = RequestMethod.POST)
    public ResultModel updateDimActivityType2s(@RequestBody List<DimActivityType2Entity> list) {
        try {
            int code = type2Service.updateDimActivityType2s(list);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "删除单个活动二级类信息", notes = "删除单个活动二级类信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "body")
    @RequestMapping(value = "/DELETE_ACTIVITY_TYPE2_BY_ID", method = RequestMethod.POST)
    public ResultModel deleteDimActivityType2ById(@RequestBody String id) {
        try {
            int code = type2Service.deleteDimActivityType2ById(Integer.parseInt(id));
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "删除多个活动二级类信息", notes = "删除多个活动二级类信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Integer>", paramType = "body")
    @RequestMapping(value = "/DELETE_ACTIVITY_TYPE2_BY_IDS", method = RequestMethod.POST)
    public ResultModel deleteDimActivityType2ByIds(@RequestBody List<Integer> ids) {
        try {
            int code = type2Service.deleteDimActivityType2ByIds(ids);
            if (ids.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);

        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

}
