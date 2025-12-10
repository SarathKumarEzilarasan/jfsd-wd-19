package com.example.demo_springboot_mysql.service;

import com.example.demo_springboot_mysql.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
