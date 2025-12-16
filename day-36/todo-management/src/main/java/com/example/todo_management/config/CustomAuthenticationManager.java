package com.example.todo_management.config;

import com.example.todo_management.entity.User;
import com.example.todo_management.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomAuthenticationManager implements AuthenticationManager {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public CustomAuthenticationManager(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        if (isValidUser(username, password)) {
            return new UsernamePasswordAuthenticationToken(username, password);
        } else {
            throw new AuthenticationException("Invalid Credentials") {
            };
        }
    }

    private boolean isValidUser(String username, String password) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not exists by Username or Email"));

        return passwordEncoder.matches(password, user.getPassword());
    }
}
