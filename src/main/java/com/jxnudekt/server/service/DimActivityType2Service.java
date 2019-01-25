package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.DimActivityType2Entity;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-25 17:38
 **/
public interface DimActivityType2Service {
    List<DimActivityType2Entity> findDimActivityType2All();
    List<DimActivityType2Entity> findDimActivityType2ByCondition(DimActivityType2Entity type2Entity);
    List<DimActivityType2Entity> findDimActivityType2ByIds(List<Integer> ids);
    int insertDimActivityType2(DimActivityType2Entity type2Entity);
    int insertDimActivityType2s(List<DimActivityType2Entity> list);
    int updateDimActivityType2(DimActivityType2Entity type2Entity);
    int updateDimActivityType2s(List<DimActivityType2Entity> list);
    int deleteDimActivityType2ById(Integer id);
    int deleteDimActivityType2ByIds(List<Integer> ids);
}
