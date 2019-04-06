package com.jxnudekt.server.entity;

import java.util.Date;

/**
 * DIM_SEMESTER
 * 
 * @author liaoxiang
 * @version 1.0.0 2019-04-06
 */
public class DimSemesterEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7982948700334311456L;

    /** id */
    private Integer id;

    /** semester */
    private String semester;

    /** startTime */
    private Date startTime;

    /** endTime */
    private Date endTime;

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
     * 获取semester
     * 
     * @return semester
     */
    public String getSemester() {
        return this.semester;
    }

    /**
     * 设置semester
     * 
     * @param semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * 获取startTime
     * 
     * @return startTime
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * 设置startTime
     * 
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取endTime
     * 
     * @return endTime
     */
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * 设置endTime
     * 
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}