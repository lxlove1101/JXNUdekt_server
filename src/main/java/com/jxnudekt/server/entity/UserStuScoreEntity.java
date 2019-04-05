package com.jxnudekt.server.entity;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author: bianj
 * Email: edinsker@163.com
 * Version: 5.9.0
 */
import java.util.Date;

/**
 * USER_STU_SCORE
 * 
 * @author liaoxiang
 * @version 1.0.0 2019-04-05
 */
public class UserStuScoreEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7577841166127060121L;

    /** id */
    private Long id;

    /** userId */
    private Long userId;

    private String username;

    private String headImg;

    /** score */
    private Integer score;

    /** atyCount */
    private Integer atyCount;

    /** semester */
    private Integer semester;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String usernmame) {
        this.username = usernmame;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取score
     * 
     * @return score
     */
    public Integer getScore() {
        return this.score;
    }

    /**
     * 设置score
     * 
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取atyCount
     * 
     * @return atyCount
     */
    public Integer getAtyCount() {
        return this.atyCount;
    }

    /**
     * 设置atyCount
     * 
     * @param atyCount
     */
    public void setAtyCount(Integer atyCount) {
        this.atyCount = atyCount;
    }

    /**
     * 获取semester
     * 
     * @return semester
     */
    public Integer getSemester() {
        return this.semester;
    }

    /**
     * 设置semester
     * 
     * @param semester
     */
    public void setSemester(Integer semester) {
        this.semester = semester;
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