package com.jxnudekt.server.entity;

import java.util.Date;

public class UserStuEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3315012649616804803L;

    /** id */
    private Long id;

    /** userId */
    private String userId;

    /** password */
    private String password;

    /** username */
    private String username;

    /** classId */
    private Integer classId;

    /** collegeId */
    private Integer collegeId;

    /** headImg */
    private String headImg;

    /** sex */
    private Integer sex;

    /** telephone */
    private String telephone;

    /** email */
    private String email;

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
     * 获取password
     * 
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置password
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取username
     * 
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置username
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取classId
     * 
     * @return classId
     */
    public Integer getClassId() {
        return this.classId;
    }

    /**
     * 设置classId
     * 
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
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
     * 获取headImg
     * 
     * @return headImg
     */
    public String getHeadImg() {
        return this.headImg;
    }

    /**
     * 设置headImg
     * 
     * @param headImg
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取sex
     * 
     * @return sex
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * 设置sex
     * 
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取telephone
     * 
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * 设置telephone
     * 
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取email
     * 
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置email
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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