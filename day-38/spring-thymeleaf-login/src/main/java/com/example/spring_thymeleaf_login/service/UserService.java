package com.example.spring_thymeleaf_login.service;

import com.example.spring_thymeleaf_login.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    UserDto findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
