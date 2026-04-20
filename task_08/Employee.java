package com.college.task08;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee() {
        this.name = "Default Employee";
        this.department = "General";
    }

    // Getters and Setters
    public String getInfo() {
        return "Employee: " + name + " [" + department + "]";
    }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
}
