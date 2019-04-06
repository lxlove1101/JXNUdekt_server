package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.UserStuScoreEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserStuScoreDao {
    List<UserStuScoreEntity> rankUserStuByatyCount(@Param("classId")Integer classId, @Param("semester")Integer semester);
    List<UserStuScoreEntity> rankUserStuByScore(@Param("classId")Integer classId, @Param("semester")Integer semester);
    Map findUserScoreBySemester(@Param("userId")Integer userId, @Param("semester")Integer semester);
}
