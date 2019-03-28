package com.jxnudekt.server.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityStuCommitDao {
    int insertActivityStuCommits(@Param("userId")String userId, @Param("activityIds")List<Long> ids);
}