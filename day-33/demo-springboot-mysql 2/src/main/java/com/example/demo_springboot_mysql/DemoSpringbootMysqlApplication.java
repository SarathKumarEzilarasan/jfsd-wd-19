package com.example.demo_springboot_mysql;

import com.example.demo_springboot_mysql.dto.UserDto;
import com.example.demo_springboot_mysql.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringbootMysqlApplication {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

//        modelMapper.createTypeMap(UserDto.class, User.class)
//                .addMapping(UserDto::getEmail, User::setId);
//
//        modelMapper.createTypeMap(User.class, UserDto.class)
//                .addMapping(User::getEmail, UserDto::setId);


        return modelMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootMysqlApplication.class, args);
    }

}
