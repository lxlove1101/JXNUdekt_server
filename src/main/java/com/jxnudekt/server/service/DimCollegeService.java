package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.DimCollegeEntity;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-02-26 01:31
 **/
public interface DimCollegeService {
    List<DimCollegeEntity> findDimCollegeAll();
    List<DimCollegeEntity> findDimCollegeByCondition(DimCollegeEntity collegeEntity);
    List<DimCollegeEntity> findDimCollegeByIds(List<Integer> ids);
    int insertDimCollege(DimCollegeEntity collegeEntity);
    int insertDimColleges(List<DimCollegeEntity> list);
    int updateDimCollege(DimCollegeEntity collegeEntity);
    int updateDimColleges(List<DimCollegeEntity> list);
    int deleteDimCollegeById(Integer id);
    int deleteDimCollegeByIds(List<Integer> ids);
}
