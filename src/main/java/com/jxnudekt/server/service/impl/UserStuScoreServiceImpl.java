package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.UserStuScoreDao;
import com.jxnudekt.server.entity.UserStuScoreEntity;
import com.jxnudekt.server.service.UserStuScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "UserStuScoreService")
public class UserStuScoreServiceImpl implements UserStuScoreService {
    @Autowired
    private UserStuScoreDao userStuScoreDao;

    @Override
    public List<UserStuScoreEntity> rankUserStuByatyCount(Integer classId, Integer semester) {
        return userStuScoreDao.rankUserStuByatyCount(classId, semester);
    }

    @Override
    public List<UserStuScoreEntity> rankUserStuByScore(Integer classId, Integer semester) {
        return userStuScoreDao.rankUserStuByScore(classId, semester);
    }

    @Override
    public Map findUserScoreBySemester(Integer userId, Integer semester) {
        return userStuScoreDao.findUserScoreBySemester(userId, semester);
    }
}
