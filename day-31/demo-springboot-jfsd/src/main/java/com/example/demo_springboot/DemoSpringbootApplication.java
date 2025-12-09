package com.example.demo_springboot;

import com.example.demo_springboot.bean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringbootApplication.class, args);
//        String[] beans = context.getBeanDefinitionNames();
//        Arrays.asList(beans).forEach(System.out::println);
    }
}
