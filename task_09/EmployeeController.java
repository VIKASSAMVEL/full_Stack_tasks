package com.college.task09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @RequestMapping("/employeeDetails")
    public String getEmployeeDetails(@RequestParam("name") String name, Model model) {
        // MVC Flow: Controller accepting request and passing data to View
        model.addAttribute("empName", name);
        model.addAttribute("role", "Software Engineer");
        return "employeeView"; // Returns view name
    }
}
