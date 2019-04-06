package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.DimSemesterDao;
import com.jxnudekt.server.entity.DimSemesterEntity;
import com.jxnudekt.server.service.DimSemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "DimSemesterService")
public class DimSemesterServiceImpl implements DimSemesterService {
    @Autowired
    private DimSemesterDao dimSemesterDao;

    @Override
    public List<DimSemesterEntity> findDimSemesterAll() {
        return dimSemesterDao.findDimSemesterAll();
    }
}
