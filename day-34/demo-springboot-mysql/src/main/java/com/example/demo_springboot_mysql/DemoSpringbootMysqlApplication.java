package com.example.demo_springboot_mysql;

import com.example.demo_springboot_mysql.dto.UserDto;
import com.example.demo_springboot_mysql.entity.User;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot REST API Documentation",
                description = "Spring Boot REST API Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "John",
                        email = "test@gmail.com",
                        url = "https://www.google.com"
                )
        )
)
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
