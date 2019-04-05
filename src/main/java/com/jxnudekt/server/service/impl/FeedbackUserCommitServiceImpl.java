package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.FeedbackUserCommitDao;
import com.jxnudekt.server.entity.FeedbackUserCommitEntity;
import com.jxnudekt.server.service.FeedbackUserCommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "FeedbackUserCommitService")
public class FeedbackUserCommitServiceImpl implements FeedbackUserCommitService {

    @Autowired
    private FeedbackUserCommitDao feedbackUserCommitDao;

    @Override
    public int insertFeedbackUserCommit(Map map) {
        return feedbackUserCommitDao.insertFeedbackUserCommit(map);
    }

    @Override
    public List<FeedbackUserCommitEntity> findFeedbackUserCommitByUserId(Long userId) {
        return feedbackUserCommitDao.findFeedbackUserCommitByUserId(userId);
    }
}
