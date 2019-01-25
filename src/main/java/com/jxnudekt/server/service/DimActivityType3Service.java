package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.DimActivityType3Entity;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @Description: ->
 * @CreateDate: 2019-01-25 17:39
 **/
public interface DimActivityType3Service {
    List<DimActivityType3Entity> findDimActivityType3All();
    List<DimActivityType3Entity> findDimActivityType3ByCondition(DimActivityType3Entity type3Entity);
    List<DimActivityType3Entity> findDimActivityType3ByIds(List<Integer> ids);
    int insertDimActivityType3(DimActivityType3Entity type3Entity);
    int insertDimActivityType3s(List<DimActivityType3Entity> list);
    int updateDimActivityType3(DimActivityType3Entity type3Entity);
    int updateDimActivityType3s(List<DimActivityType3Entity> list);
    int deleteDimActivityType3ById(Integer id);
    int deleteDimActivityType3ByIds(List<Integer> ids);
}
