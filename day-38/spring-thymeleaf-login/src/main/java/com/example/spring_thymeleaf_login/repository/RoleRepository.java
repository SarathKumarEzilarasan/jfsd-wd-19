package com.example.spring_thymeleaf_login.repository;

import com.example.spring_thymeleaf_login.entity.Role;
import com.example.spring_thymeleaf_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
   Role findByName(String name);
}
