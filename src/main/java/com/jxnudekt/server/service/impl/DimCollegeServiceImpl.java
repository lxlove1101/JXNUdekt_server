package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.DimCollegeDao;
import com.jxnudekt.server.entity.DimCollegeEntity;
import com.jxnudekt.server.service.DimCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-02-26 01:32
 **/
@Service(value = "DimCollegeService")
public class DimCollegeServiceImpl implements DimCollegeService {
    @Autowired
    private DimCollegeDao dimCollegeDao;

    @Override
    public List<DimCollegeEntity> findDimCollegeAll() {
        return dimCollegeDao.findDimCollegeAll();
    }

    @Override
    public List<DimCollegeEntity> findDimCollegeByCondition(DimCollegeEntity collegeEntity) {
        return dimCollegeDao.findDimCollegeByCondition(collegeEntity);
    }

    @Override
    public List<DimCollegeEntity> findDimCollegeByIds(List<Integer> ids) {
        return dimCollegeDao.findDimCollegeByIds(ids);
    }

    @Override
    public int insertDimCollege(DimCollegeEntity collegeEntity) {
        return dimCollegeDao.insertDimCollege(collegeEntity);
    }

    @Override
    public int insertDimColleges(List<DimCollegeEntity> list) {
        return dimCollegeDao.insertDimColleges(list);
    }

    @Override
    public int updateDimCollege(DimCollegeEntity collegeEntity) {
        return dimCollegeDao.updateDimCollege(collegeEntity);
    }

    @Override
    public int updateDimColleges(List<DimCollegeEntity> list) {
        return dimCollegeDao.updateDimColleges(list);
    }

    @Override
    public int deleteDimCollegeById(Integer id) {
        return dimCollegeDao.deleteDimCollegeById(id);
    }

    @Override
    public int deleteDimCollegeByIds(List<Integer> ids) {
        return dimCollegeDao.deleteDimCollegeByIds(ids);
    }
}
