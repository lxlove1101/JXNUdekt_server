package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.DimActivityType3Dao;
import com.jxnudekt.server.entity.DimActivityType3Entity;
import com.jxnudekt.server.service.DimActivityType3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-25 17:47
 **/
@Service(value = "DimActivityType3Service")
public class DimActivityType3Impl implements DimActivityType3Service {
    @Autowired
    private DimActivityType3Dao dimActivityType3Dao;

    @Override
    public List<DimActivityType3Entity> findDimActivityType3All() {
        return dimActivityType3Dao.findDimActivityType3All();
    }

    @Override
    public List<DimActivityType3Entity> findDimActivityType3ByCondition(DimActivityType3Entity type3Entity) {
        return dimActivityType3Dao.findDimActivityType3ByCondition(type3Entity);
    }

    @Override
    public List<DimActivityType3Entity> findDimActivityType3ByIds(List<Integer> ids) {
        return dimActivityType3Dao.findDimActivityType3ByIds(ids);
    }

    @Override
    public int insertDimActivityType3(DimActivityType3Entity type3Entity) {
        return dimActivityType3Dao.insertDimActivityType3(type3Entity);
    }

    @Override
    public int insertDimActivityType3s(List<DimActivityType3Entity> list) {
        return dimActivityType3Dao.insertDimActivityType3s(list);
    }

    @Override
    public int updateDimActivityType3(DimActivityType3Entity type3Entity) {
        return dimActivityType3Dao.updateDimActivityType3(type3Entity);
    }

    @Override
    public int updateDimActivityType3s(List<DimActivityType3Entity> list) {
        return dimActivityType3Dao.updateDimActivityType3s(list);
    }

    @Override
    public int deleteDimActivityType3ById(Integer id) {
        return dimActivityType3Dao.deleteDimActivityType3ById(id);
    }

    @Override
    public int deleteDimActivityType3ByIds(List<Integer> ids) {
        return dimActivityType3Dao.deleteDimActivityType3ByIds(ids);
    }
}
