package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.UserStuScoreEntity;

import java.util.List;

public interface UserStuScoreService {
    List<UserStuScoreEntity> rankUserStuByatyCount(Integer classId, Integer semester);
    List<UserStuScoreEntity> rankUserStuByScore(Integer classId, Integer semester);
}
