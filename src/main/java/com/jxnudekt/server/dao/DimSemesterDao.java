package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.DimSemesterEntity;

import java.util.List;

public interface DimSemesterDao {
    List<DimSemesterEntity> findDimSemesterAll();
}
