package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.DimActivityType2Dao;
import com.jxnudekt.server.entity.DimActivityType2Entity;
import com.jxnudekt.server.service.DimActivityType2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-25 17:41
 **/
@Service(value = "DimActivityType2Service")
public class DimActivityType2Impl implements DimActivityType2Service {
    @Autowired
    private DimActivityType2Dao dimActivityType2Dao;

    @Override
    public List<DimActivityType2Entity> findDimActivityType2All() {
        return dimActivityType2Dao.findDimActivityType2All();
    }

    @Override
    public List<DimActivityType2Entity> findDimActivityType2ByCondition(DimActivityType2Entity type2Entity) {
        return dimActivityType2Dao.findDimActivityType2ByCondition(type2Entity);
    }

    @Override
    public List<DimActivityType2Entity> findDimActivityType2ByIds(List<Integer> ids) {
        return dimActivityType2Dao.findDimActivityType2ByIds(ids);
    }

    @Override
    public int insertDimActivityType2(DimActivityType2Entity type2Entity) {
        return dimActivityType2Dao.insertDimActivityType2(type2Entity);
    }

    @Override
    public int insertDimActivityType2s(List<DimActivityType2Entity> list) {
        return dimActivityType2Dao.insertDimActivityType2s(list);
    }

    @Override
    public int updateDimActivityType2(DimActivityType2Entity type2Entity) {
        return dimActivityType2Dao.updateDimActivityType2(type2Entity);
    }

    @Override
    public int updateDimActivityType2s(List<DimActivityType2Entity> list) {
        return dimActivityType2Dao.updateDimActivityType2s(list);
    }

    @Override
    public int deleteDimActivityType2ById(Integer id) {
        return dimActivityType2Dao.deleteDimActivityType2ById(id);
    }

    @Override
    public int deleteDimActivityType2ByIds(List<Integer> ids) {
        return dimActivityType2Dao.deleteDimActivityType2ByIds(ids);
    }
}
