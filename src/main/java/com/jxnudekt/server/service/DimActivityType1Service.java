package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.DimActivityType1Entity;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: ->
 * @CreateDate: 2019-01-23 16:54
 **/
public interface DimActivityType1Service {
    List<DimActivityType1Entity> findDimActivityType1All();
    List<DimActivityType1Entity> findDimActivityType1ByCondition(DimActivityType1Entity type1Entity);
    List<DimActivityType1Entity> findDimActivityType1ByIds(List<Integer> ids);
    int insertDimActivityType1(DimActivityType1Entity type1Entity);
    int insertDimActivityType1s(List<DimActivityType1Entity> list);
    int updateDimActivityType1(DimActivityType1Entity type1Entity);
    int updateDimActivityType1s(List<DimActivityType1Entity> list);
    int deleteDimActivityType1ById(Integer id);
    int deleteDimActivityType1ByIds(List<Integer> ids);
}
