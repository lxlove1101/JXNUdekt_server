package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.DimActivityType1Entity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: ->
 * @CreateDate: 2019-01-23 16:39
 **/
public interface DimActivityType1Dao {
    List<DimActivityType1Entity> findDimActivityType1All();
    List<DimActivityType1Entity> findDimActivityType1ByCondition(DimActivityType1Entity type1Entity);
    List<DimActivityType1Entity> findDimActivityType1ByIds(@Param(value = "list") List<Integer> ids);
    int insertDimActivityType1(DimActivityType1Entity type1Entity);
    int insertDimActivityType1s(List<DimActivityType1Entity> list);
    int updateDimActivityType1(DimActivityType1Entity type1Entity);
    int updateDimActivityType1s(List<DimActivityType1Entity> list);
    int deleteDimActivityType1ById(Integer id);
    int deleteDimActivityType1ByIds(List<Integer> ids);
}
