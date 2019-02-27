package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.UserStuDao;
import com.jxnudekt.server.entity.UserStuDetailEntity;
import com.jxnudekt.server.entity.UserStuEntity;
import com.jxnudekt.server.service.UserStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiaoXiang
 * @CreateDate: 2019-01-27 11:47
 **/
@Service(value = "UserStuService")
public class UserStuServiceImpl implements UserStuService {
    @Autowired
    private UserStuDao userStuDao;

    @Override
    public List<UserStuEntity> findUserStuAll() {
        return userStuDao.findUserStuAll();
    }

    @Override
    public List<UserStuDetailEntity> findUserDetailInfoById(Long id) {
        return userStuDao.findUserDetailInfoById(id);
    }

    @Override
    public List<UserStuDetailEntity> queryUserDetail(String param) {
        return userStuDao.queryUserDetail(param);
    }

    @Override
    public List<UserStuEntity> loginByQuery(UserStuEntity user) {
        return userStuDao.loginByQuery(user);
    }

    @Override
    public List<UserStuEntity> findUserStuByCondition(UserStuEntity user) {
        return userStuDao.findUserStuByCondition(user);
    }

    @Override
    public List<UserStuEntity> findUserStuByIds(List<Long> ids) {
        return userStuDao.findUserStuByIds(ids);
    }

    @Override
    public int insertUserStu(UserStuEntity user) {
        return userStuDao.insertUserStu(user);
    }

    @Override
    public int insertUserStus(List<UserStuEntity> users) {
        return userStuDao.insertUserStus(users);
    }

    @Override
    public int updateUserStu(UserStuEntity user) {
        return userStuDao.updateUserStu(user);
    }

    @Override
    public int updateUserStus(List<UserStuEntity> users) {
        return userStuDao.updateUserStus(users);
    }

    @Override
    public int deleteUserStuById(Long id) {
        return userStuDao.deleteUserStuById(id);
    }

    @Override
    public int deleteUserStuByIds(List<Long> ids) {
        return userStuDao.deleteUserStuByIds(ids);
    }
}
