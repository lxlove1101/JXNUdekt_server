package com.jxnudekt.server.dao;

import com.jxnudekt.server.pojo.User;

import java.util.List;

public interface UserDao {
    public Long addUser(User user);
    public Long deleteUserById(Long uid);
    public Long updateUser(User user);
    public User findUserById(Long uid);
    public List<User> findAllUser();
}
