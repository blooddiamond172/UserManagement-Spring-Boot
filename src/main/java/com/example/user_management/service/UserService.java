package com.example.user_management.service;

import com.example.user_management.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void register(User user);
}
