package com.jxnudekt.server.service.impl;

import com.jxnudekt.server.dao.UserDao;
import com.jxnudekt.server.entity.User;
import com.jxnudekt.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Long addUser(User user) {
        return userDao.addUser(user);
    }

//    @Override
//    public Long deleteUserById(Long uid) {
//        return userDao.deleteUserById(uid);
//    }

    @Override
    public Long updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User findUserById(Long uid) {
        return userDao.findUserById(uid);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
