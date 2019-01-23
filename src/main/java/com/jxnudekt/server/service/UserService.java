package com.jxnudekt.server.service;

import com.jxnudekt.server.entity.User;

import java.util.List;

public interface UserService {
    public Long addUser(User user);
//    public Long deleteUserById(Long uid);
    public Long updateUser(User user);
    public User findUserById(Long uid);
    public List<User> findAllUser();
}
