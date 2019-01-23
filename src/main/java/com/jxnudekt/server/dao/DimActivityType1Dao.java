package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.DimActivityType1Entity;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @Description: ->
 * @CreateDate: 2019-01-23 16:39
 **/
public interface DimActivityType1Dao {
    public List<DimActivityType1Entity> findDimActivityType1All();
    public List<DimActivityType1Entity> findDimActivityType1ByCondition(DimActivityType1Entity type1Entity);
    public List<DimActivityType1Entity> findDimActivityType1ByIds(List<Long> ids);
    public int insertDimActivityType1(DimActivityType1Entity type1Entity);
    public int insertDimActivityType1s(List<DimActivityType1Entity> list);
    public int updateDimActivityType1(DimActivityType1Entity type1Entity);
    public int updateDimActivityType1s(List<DimActivityType1Entity> list);
    public int deleteDimActivityType1ById(Long id);
    public int deleteDimActivityType1ByIds(List<Long> ids);
}
