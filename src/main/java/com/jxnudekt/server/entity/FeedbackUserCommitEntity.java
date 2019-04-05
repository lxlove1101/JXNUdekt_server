package com.jxnudekt.server.entity;

import java.util.Date;

/**
 * FEEDBACK_USER_COMMIT
 * 
 * @author liaoxiang
 * @version 1.0.0 2019-04-04
 */
public class FeedbackUserCommitEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4065271474302332747L;

    /** id */
    private Long id;

    /** userId */
    private Long userId;

    /** title */
    private String title;

    /** information */
    private String information;

    /** status */
    private Integer status;

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
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 设置userId
     * 
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取title
     * 
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 设置title
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取information
     * 
     * @return information
     */
    public String getInformation() {
        return this.information;
    }

    /**
     * 设置information
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * 获取status
     * 
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置status
     * 
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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