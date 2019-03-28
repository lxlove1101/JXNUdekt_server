package com.jxnudekt.server.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityStuCommitService {
    int insertActivityStuCommits(String userId, List<Long> ids);
}
