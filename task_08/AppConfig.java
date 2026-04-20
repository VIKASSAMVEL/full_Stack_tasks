package com.college.task08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.college.task08")
public class AppConfig {
    
    // Explicit bean definition if needed (Annotations are used on classes instead)
    /*
    @Bean
    public Employee employee() {
        return new Employee();
    }
    */
}
