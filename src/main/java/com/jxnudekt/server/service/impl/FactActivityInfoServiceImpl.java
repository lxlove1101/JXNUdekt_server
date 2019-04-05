package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.FactActivityInfoDao;
import com.jxnudekt.server.entity.FactActivityDetailEntity;
import com.jxnudekt.server.entity.FactActivityInfoEntity;
import com.jxnudekt.server.service.FactActivityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-02-26 17:09
 **/
@Service(value = "FactActivityInfoService")
public class FactActivityInfoServiceImpl implements FactActivityInfoService {
    @Autowired
    private FactActivityInfoDao factActivityInfoDao;

    @Override
    public List<FactActivityInfoEntity> findFactActivityInfoAll() {
        return factActivityInfoDao.findFactActivityInfoAll();
    }

    @Override
    public List<FactActivityInfoEntity> findFactActivityInfoByCondition(Map activityInfoEntity) {
        return factActivityInfoDao.findFactActivityInfoByCondition(activityInfoEntity);
    }

    @Override
    public List<FactActivityInfoEntity> findFactActivityInfoByIds(List<Long> ids) {
        return factActivityInfoDao.findFactActivityInfoByIds(ids);
    }

    @Override
    public int insertFactActivityInfo(FactActivityInfoEntity activityInfoEntity) {
        return factActivityInfoDao.insertFactActivityInfo(activityInfoEntity);
    }

    @Override
    public int insertFactActivityInfos(List<FactActivityInfoEntity> list) {
        return factActivityInfoDao.insertFactActivityInfos(list);
    }

    @Override
    public int updateFactActivityInfo(FactActivityInfoEntity activityInfoEntity) {
        return factActivityInfoDao.updateFactActivityInfo(activityInfoEntity);
    }

    @Override
    public int updateFactActivityInfos(List<FactActivityInfoEntity> list) {
        return factActivityInfoDao.updateFactActivityInfos(list);
    }

    @Override
    public int deleteFactActivityInfoById(Long id) {
        return factActivityInfoDao.deleteFactActivityInfoById(id);
    }

    @Override
    public int deleteFactActivityInfoByIds(List<Long> ids) {
        return factActivityInfoDao.deleteFactActivityInfoByIds(ids);
    }

    @Override
    public List<FactActivityDetailEntity> findFactActivityDetailByTypeId(Map activityInfoEntity) {
        return factActivityInfoDao.findFactActivityDetailByTypeId(activityInfoEntity);
    }

    @Override
    public FactActivityDetailEntity findFactActivityDetailById(Long id) {
        return factActivityInfoDao.findFactActivityDetailById(id);
    }
}
