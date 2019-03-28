package com.jxnudekt.server.entity;

import java.util.Date;

public class ActivityStuCommitEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2993847898048755219L;

    /** id */
    private Long id;

    /** userId */
    private String userId;

    /** activityId */
    private Long activityId;

    /** checkStatus */
    private Integer checkStatus;

    /** checkUserId */
    private String checkUserId;

    /** createTime */
    private Date createTime;

    /** modifyTime */
    private Date modifyTime;

    /**
     * 获取id
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取userId
     *
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 设置userId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取activityId
     *
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * 设置activityId
     *
     * @param activityId
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取checkStatus
     *
     * @return checkStatus
     */
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * 设置checkStatus
     *
     * @param checkStatus
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * 获取checkUserId
     *
     * @return checkUserId
     */
    public String getCheckUserId() {
        return this.checkUserId;
    }

    /**
     * 设置checkUserId
     *
     * @param checkUserId
     */
    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    /**
     * 获取createTime
     *
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取modifyTime
     *
     * @return modifyTime
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * 设置modifyTime
     *
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}