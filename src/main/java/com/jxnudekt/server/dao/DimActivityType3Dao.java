package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.DimActivityType3Entity;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @Description: ->
 * @CreateDate: 2019-01-25 16:55
 **/
public interface DimActivityType3Dao {
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
