package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.UserStuScoreEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserStuScoreDao {
    List<UserStuScoreEntity> rankUserStuByatyCount(@Param("classId")Integer classId, @Param("semester")Integer semester);
    List<UserStuScoreEntity> rankUserStuByScore(@Param("classId")Integer classId, @Param("semester")Integer semester);
}
