package com.piyushmehta.employeemanagementservice.controller;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @RequestMapping("/welcome")
  public String welcome() {
    return "Welcome";
  }
  @RequestMapping("/employees")
  public List<Employee> getAllEmployees(){
    return Arrays.asList(
        new Employee(1,"Tech","Mehta"),
        new Employee(2,"Tech","Mehta")
    );
  }
}
