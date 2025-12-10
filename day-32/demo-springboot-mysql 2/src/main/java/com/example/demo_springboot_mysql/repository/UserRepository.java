package com.example.demo_springboot_mysql.repository;

import com.example.demo_springboot_mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
