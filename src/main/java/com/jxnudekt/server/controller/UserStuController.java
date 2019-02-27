package com.jxnudekt.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxnudekt.server.entity.UserStuDetailEntity;
import com.jxnudekt.server.entity.UserStuEntity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.UserStuService;
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
 * @CreateDate: 2019-01-27 11:53
 **/
@Api(tags = "UserStuController", description = "学生用户类")
@RestController
@RequestMapping("/API")
public class UserStuController {
    @Autowired
    private UserStuService userStuService;

    @ApiOperation(value = "查询所有学生用户信息", notes = "查询所有学生用户信息")
    @RequestMapping(value = "/QUERY_USER_INFO_BY_ALL", method = RequestMethod.GET)
    public ResultModel findUserStuAll() {
        try {
            List<UserStuEntity> users = userStuService.findUserStuAll();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", users);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "登录查询", notes = "根据帐号密码查询学生用户信息")
    @ApiImplicitParam(name = "user", value = "学生用户信息对象Map", required = true, dataType = "UserStuEntity", paramType = "body")
    @RequestMapping(value = "/LOGIN_QUERY", method = RequestMethod.POST)
    public ResultModel loginByQuery(@RequestBody UserStuEntity user) {
        try {
            List<UserStuEntity> users = userStuService.loginByQuery(user);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", users);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "查询用户详细信息", notes = "根据用户id查询用户详细信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/FIND_USER_DETAIL_INFO_BY_ID/{id}", method = RequestMethod.GET)
    public ResultModel findUserDetailInfoById(@PathVariable String id) {
        try {
            List<UserStuDetailEntity> result = userStuService.findUserDetailInfoById(Long.parseLong(id));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", result);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "搜索用户", notes = "根据学号或姓名查询用户详细信息")
    @ApiImplicitParam(name = "param", value = "param", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/QUERY_USER_DETAIL/{param}", method = RequestMethod.GET)
    public ResultModel queryUserDetail(@PathVariable String param) {
        try {
            List<UserStuDetailEntity> result = userStuService.queryUserDetail(param);
            if (result.size() == 0) {
                return ResultTool.result("CONTENT_EMPTY", "", null);
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", result);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "分页查询学生用户信息", notes = "分页查询学生用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "查询的页数", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量大小", required = true, dataType = "Integer", paramType = "query")})
    @RequestMapping(value = "/QUERY_USER_INFO_BY_PAGE", method = RequestMethod.GET)
    public ResultModel findUserStuByPage(@RequestParam Integer page, @RequestParam Integer pageSize) {
        try {
            if (page == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            if (pageSize == null) {
                return ResultTool.result("PARAMETER_ERROR", "", null);
            }
            PageHelper.startPage(page, pageSize);
            List<UserStuEntity> users = userStuService.findUserStuAll();
            PageInfo<UserStuEntity> pageInfo = new PageInfo<>(users);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pageInfo", pageInfo);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据条件查询学生用户信息", notes = "根据条件查询学生用户信息")
    @RequestMapping(value = "/QUERY_USER_INFO_BY_CONDITION", method = RequestMethod.GET)
    public ResultModel findUserStuByCondition(UserStuEntity user) {
        try {
            List<UserStuEntity> users = userStuService.findUserStuByCondition(user);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", users);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据主键id数组查询学生用户信息", notes = "根据主键id数组查询学生用户信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Long>", paramType = "body")
    @RequestMapping(value = "/QUERY_USER_INFO_BY_IDS", method = RequestMethod.POST)
    public ResultModel findUserStuByIds(@RequestBody List<Long> ids) {
        try {
            List<UserStuEntity> users = userStuService.findUserStuByIds(ids);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", users);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }

    }

    @ApiOperation(value = "插入单个学生用户信息", notes = "插入单个学生用户信息")
    @ApiImplicitParam(name = "user", value = "学生用户信息对象Map", required = true, dataType = "UserStuEntity", paramType = "body")
    @RequestMapping(value = "/INSERT_USER_INFO_FOR_ONE", method = RequestMethod.POST)
    public ResultModel insertUserStu(@RequestBody UserStuEntity user){
        try {
            int code = userStuService.insertUserStu(user);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "插入多个学生用户信息", notes = "插入多个学生用户信息")
    @ApiImplicitParam(name = "list", value = "学生用户信息数组对象List<UserStuEntity>", required = true, dataType = "List<UserStuEntity>", paramType = "body")
    @RequestMapping(value = "/INSERT_USER_INFO_FOR_MORE", method = RequestMethod.POST)
    public ResultModel insertUserStus(@RequestBody List<UserStuEntity> list) {
        try {
            int code = userStuService.insertUserStus(list);
            if (list.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "更新单个学生用户信息", notes = "更新单个学生用户信息")
    @ApiImplicitParam(name = "user", value = "学生用户信息对象Map", required = true, dataType = "UserStuEntity", paramType = "body")
    @RequestMapping(value = "/UPDATE_USER_INFO_FOR_ONE", method = RequestMethod.POST)
    public ResultModel updateUserStu(@RequestBody UserStuEntity user) {
        try {
            int code = userStuService.updateUserStu(user);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "更新多个学生用户信息", notes = "更新多个学生用户信息")
    @ApiImplicitParam(name = "list", value = "学生用户信息数组对象List<UserStuEntity>", required = true, dataType = "List<UserStuEntity>", paramType = "body")
    @RequestMapping(value = "/UPDATE_USER_INFO_FOR_MORE", method = RequestMethod.POST)
    public ResultModel updateUserStus(@RequestBody List<UserStuEntity> list) {
        try {
            int code = userStuService.updateUserStus(list);
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "删除单个学生用户信息", notes = "删除单个学生用户信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/DELETE_USER_INFO_BY_ID/{id}", method = RequestMethod.DELETE)
    public ResultModel deleteUserStuById(@PathVariable String id) {
        try {
            int code = userStuService.deleteUserStuById(Long.parseLong(id));
            if (1 == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "删除多个学生用户信息", notes = "删除多个学生用户信息")
    @ApiImplicitParam(name = "ids", value = "id数组", required = true, dataType = "List<Long>", paramType = "body")
    @RequestMapping(value = "/DELETE_USER_INFO_BY_IDS", method = RequestMethod.POST)
    public ResultModel deleteUserStuByIds(@RequestBody List<Long> ids) {
        try {
            int code = userStuService.deleteUserStuByIds(ids);
            if (ids.size() == code) {
                return ResultTool.result("SUCCESS", "", null);
            }
            return ResultTool.result("NOT_FOUND", "失败", null);

        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

}
