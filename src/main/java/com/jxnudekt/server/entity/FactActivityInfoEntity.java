package com.jxnudekt.server.entity;

import java.util.Date;

public class FactActivityInfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8362417200111021380L;

    /** id */
    private Long id;

    /** name */
    private String name;

    /** type1id */
    private Integer type1id;

    /** type2id */
    private Integer type2id;

    /** type3id */
    private Integer type3id;

    /** score */
    private Integer score;

    /** status */
    private Integer status;

    /** collegeId */
    private Integer collegeId;

    /** createUserId */
    private String createUserId;

    /** modifyUserId */
    private String modifyUserId;

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
     * 获取name
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取type1id
     * 
     * @return type1id
     */
    public Integer getType1id() {
        return this.type1id;
    }

    /**
     * 设置type1id
     * 
     * @param type1id
     */
    public void setType1id(Integer type1id) {
        this.type1id = type1id;
    }

    /**
     * 获取type2id
     * 
     * @return type2id
     */
    public Integer getType2id() {
        return this.type2id;
    }

    /**
     * 设置type2id
     * 
     * @param type2id
     */
    public void setType2id(Integer type2id) {
        this.type2id = type2id;
    }

    /**
     * 获取type3id
     * 
     * @return type3id
     */
    public Integer getType3id() {
        return this.type3id;
    }

    /**
     * 设置type3id
     * 
     * @param type3id
     */
    public void setType3id(Integer type3id) {
        this.type3id = type3id;
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
     * 获取collegeId
     * 
     * @return collegeId
     */
    public Integer getCollegeId() {
        return this.collegeId;
    }

    /**
     * 设置collegeId
     * 
     * @param collegeId
     */
    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * 获取createUserId
     * 
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * 设置createUserId
     * 
     * @param createUserId
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取modifyUserId
     * 
     * @return modifyUserId
     */
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * 设置modifyUserId
     * 
     * @param modifyUserId
     */
    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
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