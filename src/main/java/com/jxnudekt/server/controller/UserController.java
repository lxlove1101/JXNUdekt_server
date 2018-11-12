package com.jxnudekt.server.controller;

import com.jxnudekt.server.domain.User;
import com.jxnudekt.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/api/user/delete", method = RequestMethod.DELETE)
    public void deleteUserById(@RequestBody Long uid){
        userService.deleteUserById(uid);
    }

    @RequestMapping(value = "/api/user/update", method = RequestMethod.POST)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(value = "/api/user/{uid}", method = RequestMethod.GET)
    public User findUserById(@PathVariable Long uid){
        return userService.findUserById(uid);
    }

    @RequestMapping(value = "/api/user/findAll", method = RequestMethod.GET)
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
