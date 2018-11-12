package com.jxnudekt.server.controller;

import com.jxnudekt.server.pojo.User;
import com.jxnudekt.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

//    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
//    public void deleteUserById(@RequestBody Long uid){
//        userService.deleteUserById(uid);
//    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
    public User findUserById(@PathVariable Long uid){
        return userService.findUserById(uid);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
