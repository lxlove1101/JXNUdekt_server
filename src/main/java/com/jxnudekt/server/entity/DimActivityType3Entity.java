package com.jxnudekt.server.entity;

import java.util.Date;

public class DimActivityType3Entity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2592373028762258863L;

    /** id */
    private Integer id;

    /** name */
    private String name;

    /** tag */
    private String tag;

    /** type1id */
    private Integer type1id;

    /** type2id */
    private Integer type2id;

    /** isValid */
    private Integer isValid;

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
     * 获取isValid
     * 
     * @return isValid
     */
    public Integer getIsValid() {
        return this.isValid;
    }

    /**
     * 设置isValid
     * 
     * @param isValid
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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