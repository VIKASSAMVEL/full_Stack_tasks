package com.college.task08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private final Employee employee;

    @Autowired
    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public void displayEmployee() {
        System.out.println("Dependency Injection Successful!");
        System.out.println(employee.getInfo());
    }
}
