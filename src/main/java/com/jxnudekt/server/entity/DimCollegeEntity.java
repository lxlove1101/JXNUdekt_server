package com.jxnudekt.server.entity;

import java.util.Date;

public class DimCollegeEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3129397064229059519L;

    /** id */
    private Integer id;

    /** collegeName */
    private String collegeName;

    /** tag */
    private String tag;

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
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取collegeName
     * 
     * @return collegeName
     */
    public String getCollegeName() {
        return this.collegeName;
    }

    /**
     * 设置collegeName
     * 
     * @param collegeName
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * 获取tag
     * 
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * 设置tag
     * 
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
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