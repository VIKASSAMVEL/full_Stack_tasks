package com.college.task08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring Context (which is a BeanFactory)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the EmployeeService bean from the container
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        // Display Employee details using DI
        System.out.println("--- Spring IoC & Dependency Injection Demo ---");
        employeeService.displayEmployee();
        
        // Demonstrating in-memory storage simulation
        Employee emp = context.getBean(Employee.class);
        emp.setName("Jane Doe");
        emp.setDepartment("Human Resources");
        
        System.out.println("\n--- Updated In-Memory Data ---");
        employeeService.displayEmployee();
    }
}
