package com.example.user_management.controller;

import com.example.user_management.model.User;
import com.example.user_management.service.UserService;
import com.example.user_management.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = {"user-management"})
@RestController

public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping
    public List<User> getAllUser(){
        return userServiceImpl.getUserList();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user) {
        userServiceImpl.register(user);
    }
}
