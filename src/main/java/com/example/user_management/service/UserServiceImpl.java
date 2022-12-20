package com.example.user_management.service;

import com.example.user_management.model.User;
import com.example.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public void register(User user) {
        Optional<User> result = userRepository.findUserByEmail(user.getEmail());

        if (result.isPresent()) {
            throw new IllegalStateException("Email " + user.getEmail() + " existed");
        }

        userRepository.save(user);
    }
}
