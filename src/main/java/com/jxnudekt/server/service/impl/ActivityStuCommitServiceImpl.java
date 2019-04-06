package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.ActivityStuCommitDao;
import com.jxnudekt.server.service.ActivityStuCommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ActivityStuCommitService")
public class ActivityStuCommitServiceImpl implements ActivityStuCommitService {

    @Autowired
    private ActivityStuCommitDao activityStuCommitDao;

    @Override
    public int insertActivityStuCommits(String userId, List<Long> ids) {
        return activityStuCommitDao.insertActivityStuCommits(userId, ids);
    }

    @Override
    public List findActivityStuCommitBySemester(String startTime, String endTime, String userId) {
        return activityStuCommitDao.findActivityStuCommitBySemester(startTime, endTime, userId);
    }

    @Override
    public int deleteActivityStuCommitById(String id) {
        return activityStuCommitDao.deleteActivityStuCommitById(id);
    }
}
