package com.jxnudekt.server.service;

import java.util.List;

public interface ActivityStuCommitService {
    int insertActivityStuCommits(String userId, List<Long> ids);
    List findActivityStuCommitBySemester(String startTime, String endTime, String userId);
    int deleteActivityStuCommitById(String id);
}
