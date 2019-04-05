package com.jxnudekt.server.dao;

import com.jxnudekt.server.entity.FeedbackUserCommitEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FeedbackUserCommitDao {
    int insertFeedbackUserCommit(Map map);
    List<FeedbackUserCommitEntity> findFeedbackUserCommitByUserId(@Param(value = "userId") Long userId);
}
