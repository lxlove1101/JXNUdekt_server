package com.jxnudekt.server.controller;

import com.jxnudekt.server.dao.FactActivityInfoDao;
import com.jxnudekt.server.entity.FactActivityInfoEntity;
import com.jxnudekt.server.entity.UserStuScoreEntity;
import com.jxnudekt.server.model.ResultModel;
import com.jxnudekt.server.service.FactActivityInfoService;
import com.jxnudekt.server.service.UserStuScoreService;
import com.jxnudekt.server.utils.ResultTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "StatisticalController", description = "统计数据相关接口")
@RestController
@RequestMapping("/API")
public class StatisticalController {
    @Autowired
    private UserStuScoreService userStuScoreService;

    @Autowired
    private FactActivityInfoService factActivityInfoService;

    @ApiOperation(value = "班级排行信息", notes = "班级排行信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classId", value = "班级ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "排序条件", required = true, dataType = "String", paramType = "query")})
    @RequestMapping(value = "/RANK_INFO_BY_CLASS", method = RequestMethod.GET)
    public ResultModel queryRankInfoByType(@RequestParam String classId, @RequestParam String semester, @RequestParam String type) {
        try {
            if(type.equals("0")){
                List<UserStuScoreEntity> list = userStuScoreService.rankUserStuByatyCount(Integer.parseInt(classId), Integer.parseInt(semester));
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("content", list);
                return ResultTool.result("SUCCESS", "", map);
            }
            if(type.equals("1")){
                List<UserStuScoreEntity> list = userStuScoreService.rankUserStuByScore(Integer.parseInt(classId), Integer.parseInt(semester));
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("content", list);
                return ResultTool.result("SUCCESS", "", map);
            }
            return ResultTool.result("111", "", null);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "用户学期所获得的分数", notes = "用户学期所获得的分数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期ID", required = true, dataType = "String", paramType = "query")})
    @RequestMapping(value = "/QUERY_SEMESTER_SCORE_BY_USER", method = RequestMethod.GET)
    public ResultModel querySemesterScoreByUser(@RequestParam String userId, @RequestParam String semester) {
        try {
            Map result = userStuScoreService.findUserScoreBySemester(Integer.parseInt(userId), Integer.parseInt(semester));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", result);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }

    @ApiOperation(value = "根据学院查询发布的活动", notes = "根据学院查询发布的活动")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "collegeId", value = "学院ID", required = true, dataType = "String", paramType = "query")})
    @RequestMapping(value = "/QUERY_ACTIVITY_BY_COLLEGE", method = RequestMethod.GET)
    public ResultModel queryActivityByCollege(@RequestParam String collegeId) {
        try {
            List<FactActivityInfoEntity> list = factActivityInfoService.findFactActivityByCollege(Integer.parseInt((collegeId)));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", list);
            return ResultTool.result("SUCCESS", "", map);
        } catch (Exception e) {
            return ResultTool.result("NOT_FOUND", e.getMessage(), null);
        }
    }


}
