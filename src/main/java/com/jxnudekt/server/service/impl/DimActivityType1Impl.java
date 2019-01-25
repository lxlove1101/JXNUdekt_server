package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.DimActivityType1Dao;
import com.jxnudekt.server.entity.DimActivityType1Entity;
import com.jxnudekt.server.service.DimActivityType1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-23 16:56
 **/
@Service(value = "DimActivityType1Service")
public class DimActivityType1Impl implements DimActivityType1Service {

    @Autowired
    private DimActivityType1Dao dimActivityType1Dao;

    @Override
    public List<DimActivityType1Entity> findDimActivityType1All() {
        return dimActivityType1Dao.findDimActivityType1All();
    }

    @Override
    public List<DimActivityType1Entity> findDimActivityType1ByCondition(DimActivityType1Entity type1Entity) {
        return dimActivityType1Dao.findDimActivityType1ByCondition(type1Entity);
    }

    @Override
    public List<DimActivityType1Entity> findDimActivityType1ByIds(List<Integer> ids) {
        return dimActivityType1Dao.findDimActivityType1ByIds(ids);
    }

    @Override
    public int insertDimActivityType1(DimActivityType1Entity type1Entity) {
        return dimActivityType1Dao.insertDimActivityType1(type1Entity);
    }

    @Override
    public int insertDimActivityType1s(List<DimActivityType1Entity> list) {
        return dimActivityType1Dao.insertDimActivityType1s(list);
    }

    @Override
    public int updateDimActivityType1(DimActivityType1Entity type1Entity) {
        return dimActivityType1Dao.updateDimActivityType1(type1Entity);
    }

    @Override
    public int updateDimActivityType1s(List<DimActivityType1Entity> list) {
        return dimActivityType1Dao.updateDimActivityType1s(list);
    }

    @Override
    public int deleteDimActivityType1ById(Integer id) {
        return dimActivityType1Dao.deleteDimActivityType1ById(id);
    }

    @Override
    public int deleteDimActivityType1ByIds(List<Integer> ids) {
        return dimActivityType1Dao.deleteDimActivityType1ByIds(ids);
    }
}
