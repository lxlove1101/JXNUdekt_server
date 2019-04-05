package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.FeedbackUserCommitEntity;

import java.util.List;
import java.util.Map;

public interface FeedbackUserCommitService {
    int insertFeedbackUserCommit(Map map);
    List<FeedbackUserCommitEntity> findFeedbackUserCommitByUserId(Long userId);
}
