package com.jxnudekt.server.entity;

public class User {

    private Long id;
    private Long uid;
    private String name;
    private String descrioition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrioition() {
        return descrioition;
    }

    public void setDescrioition(String descrioition) {
        this.descrioition = descrioition;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
