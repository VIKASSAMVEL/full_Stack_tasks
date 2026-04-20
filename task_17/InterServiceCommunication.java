package com.college.task17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AcademicController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/academic/student/{id}")
    public String getFullStudentAcademicRecord(@PathVariable Long id) {
        try {
            // Inter-service call to Student Service
            String studentBaseInfo = restTemplate.getForObject("http://STUDENT-SERVICE/students/" + id, String.class);
            return "Academic Record for: " + studentBaseInfo + " | CGPA: 9.5";
        } catch (Exception e) {
            // Graceful failure / Fallback logic
            System.err.println("Student Service is unavailable. Returning cached/default data.");
            return "Academic Record for Student ID [" + id + "] | (General Info Unavailable) | CGPA: 9.5";
        }
    }
}
