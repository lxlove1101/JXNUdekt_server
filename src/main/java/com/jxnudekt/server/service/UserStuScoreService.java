package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.UserStuScoreEntity;

import java.util.List;
import java.util.Map;

public interface UserStuScoreService {
    List<UserStuScoreEntity> rankUserStuByatyCount(Integer classId, Integer semester);
    List<UserStuScoreEntity> rankUserStuByScore(Integer classId, Integer semester);
    Map findUserScoreBySemester(Integer userId, Integer semester);
}
