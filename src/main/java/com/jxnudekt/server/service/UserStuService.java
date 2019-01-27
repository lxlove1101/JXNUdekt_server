package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.UserStuEntity;

import java.util.List;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-27 11:46
 **/
public interface UserStuService {
    List<UserStuEntity> findUserStuAll();
    List<UserStuEntity> findUserStuByCondition(UserStuEntity user);
    List<UserStuEntity> findUserStuByIds(List<Long> ids);
    int insertUserStu(UserStuEntity user);
    int insertUserStus(List<UserStuEntity> users);
    int updateUserStu(UserStuEntity user);
    int updateUserStus(List<UserStuEntity> users);
    int deleteUserStuById(Long id);
    int deleteUserStuByIds(List<Long> ids);
}
