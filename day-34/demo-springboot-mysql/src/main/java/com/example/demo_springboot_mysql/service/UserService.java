package com.example.demo_springboot_mysql.service;

import com.example.demo_springboot_mysql.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getUsers();

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long userId);
}
