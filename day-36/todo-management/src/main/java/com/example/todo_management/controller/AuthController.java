package com.example.todo_management.controller;

import com.example.todo_management.dto.LoginRequestDto;
import com.example.todo_management.util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDto loginRequestDto) {
        UsernamePasswordAuthenticationToken token = UsernamePasswordAuthenticationToken.unauthenticated(loginRequestDto.getUsername()
                , loginRequestDto.getPassword());
        authenticationManager.authenticate(token);
        String jwt = jwtUtil.generate(loginRequestDto.getUsername());

        return ResponseEntity.ok(jwt);
    }
}
