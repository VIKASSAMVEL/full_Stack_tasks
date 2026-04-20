package com.college.task09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // Run the Spring Boot application
        // This accepts user requests and maps them to controllers
        SpringApplication.run(MainApplication.class, args);
        System.out.println("Spring MVC Application Started!");
        System.out.println("Access employee details at: http://localhost:8080/employeeDetails?name=Vikas");
    }
}
