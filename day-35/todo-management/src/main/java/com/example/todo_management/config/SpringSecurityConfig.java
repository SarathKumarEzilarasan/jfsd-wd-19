package com.example.todo_management.config;

import com.example.todo_management.entity.User;
import com.example.todo_management.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

@Configuration
//@EnableMethodSecurity
public class SpringSecurityConfig implements UserDetailsService {

    private UserRepository userRepository;

    public SpringSecurityConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
        httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("ADMIN", "USER");
                    auth.requestMatchers(HttpMethod.POST, "/api/**").hasRole("ADMIN");
                    auth.requestMatchers(HttpMethod.PUT, "/api/**").hasRole("ADMIN");
                    auth.requestMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN");
                    auth.requestMatchers(HttpMethod.PATCH, "/api/**").hasRole("ADMIN");
//                    auth.requestMatchers(HttpMethod.GET, "/api/signup").permitAll();
                    auth.anyRequest().authenticated();
                })
                .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
                .orElseThrow(() -> new UsernameNotFoundException("User not exists by Username or Email"));

        Set<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());

        org.springframework.security.core.userdetails.User _user =
                new org.springframework.security.core.userdetails.User(
                        usernameOrEmail,
                        user.getPassword(),
                        authorities
                );

        return _user;
    }




//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails john = User.builder()
//                .username("john").roles("USER", "ADMIN")
//                .password(passwordEncoder().encode("password")).build();
//        UserDetails admin = User.builder()
//                .username("admin").roles("ADMIN")
//                .password(passwordEncoder().encode("password")).build();
//
//        return new InMemoryUserDetailsManager(john, admin);
//    }

}
