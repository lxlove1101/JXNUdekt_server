package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.UserStuDetailEntity;
import com.jxnudekt.server.entity.UserStuEntity;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-27 10:47
 **/
public interface UserStuDao {
    List<UserStuEntity> findUserStuAll();
    List<UserStuDetailEntity> findUserDetailInfoById(Long id);
    List<UserStuDetailEntity> queryUserDetail(Map map);
    List<UserStuEntity> loginByQuery(UserStuEntity user);
    List<UserStuEntity> findUserStuByCondition(UserStuEntity user);
    List<UserStuEntity> findUserStuByIds(List<Long> ids);
    int insertUserStu(UserStuEntity user);
    int insertUserStus(List<UserStuEntity> users);
    int updateUserStu(UserStuEntity user);
    int updateUserStus(List<UserStuEntity> users);
    int deleteUserStuById(Long id);
    int deleteUserStuByIds(List<Long> ids);
}
