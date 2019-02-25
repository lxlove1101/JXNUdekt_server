package com.jxnudekt.server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DimActivityType2Entity implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = -2355410657145214257L;

    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * tag
     */
    private String tag;

    /**
     * type1id
     */
    private Integer type1id;

    /**
     * isValid
     */
    private Integer isValid;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * modifyTime
     */
    private Date modifyTime;

    private List<DimActivityType3Entity> type3List;

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

    public List<DimActivityType3Entity> getType3List() {
        return type3List;
    }

    public void setType3List(List<DimActivityType3Entity> type3List) {
        this.type3List = type3List;
    }

    public void addType3List(DimActivityType3Entity type3Entity) {
        if(this.type3List == null){
            this.type3List = new ArrayList<DimActivityType3Entity>();
        }
        this.type3List.add(type3Entity);
    }
}