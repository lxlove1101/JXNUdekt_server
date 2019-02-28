package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.FactActivityDetailEntity;
import com.jxnudekt.server.entity.FactActivityInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-02-26 16:57
 **/
public interface FactActivityInfoDao {
    List<FactActivityInfoEntity> findFactActivityInfoAll();
    List<FactActivityInfoEntity> findFactActivityInfoByCondition(FactActivityInfoEntity activityInfoEntity);
    List<FactActivityInfoEntity> findFactActivityInfoByIds(List<Long> ids);
    int insertFactActivityInfo(FactActivityInfoEntity activityInfoEntity);
    int insertFactActivityInfos(List<FactActivityInfoEntity> list);
    int updateFactActivityInfo(FactActivityInfoEntity activityInfoEntity);
    int updateFactActivityInfos(List<FactActivityInfoEntity> list);
    int deleteFactActivityInfoById(Long id);
    int deleteFactActivityInfoByIds(List<Long> ids);

//    根据一级类id查询所有活动详细信息->关联具体类别名称
    List<FactActivityDetailEntity> findFactActivityDetailByTypeId(Map activityInfoEntity);
}
