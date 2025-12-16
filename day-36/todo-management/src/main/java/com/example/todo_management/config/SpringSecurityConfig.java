package com.example.todo_management.config;

import com.example.todo_management.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
//@EnableMethodSecurity
public class SpringSecurityConfig {

    private UserRepository userRepository;
    private JwtTokenFilter jwtTokenFilter;

    public SpringSecurityConfig(UserRepository userRepository, JwtTokenFilter jwtTokenFilter) {
        this.userRepository = userRepository;
        this.jwtTokenFilter = jwtTokenFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
        httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> {
//                    auth.requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("ADMIN", "USER");
//                    auth.requestMatchers(HttpMethod.POST, "/api/**").hasRole("ADMIN");
//                    auth.requestMatchers(HttpMethod.PUT, "/api/**").hasRole("ADMIN");
//                    auth.requestMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN");
//                    auth.requestMatchers(HttpMethod.PATCH, "/api/**").hasRole("ADMIN");
                    auth.requestMatchers(HttpMethod.POST, "/login").permitAll();
                    auth.anyRequest().authenticated();
                })
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);

//                .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
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


//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) {
//        return configuration.getAuthenticationManager();
//    }
}
