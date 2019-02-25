package com.jxnudekt.server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DimActivityType1Entity implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 6611614818552658095L;

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

    private List<DimActivityType2Entity> type2List;

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

    public List<DimActivityType2Entity> getType2List() {
        return type2List;
    }

    public void setType2List(List<DimActivityType2Entity> type2List) {
        this.type2List = type2List;
    }

    public void addType2List(DimActivityType2Entity type2Entity) {
        if(this.type2List == null){
            this.type2List = new ArrayList<DimActivityType2Entity>();
        }
        this.type2List.add(type2Entity);
    }
}