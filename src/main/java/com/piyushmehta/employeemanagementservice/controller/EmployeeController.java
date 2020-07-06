package com.piyushmehta.employeemanagementservice.controller;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import com.piyushmehta.employeemanagementservice.service.EmployeeService;
import com.piyushmehta.employeemanagementservice.service.EmployeeServiceImpl;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @RequestMapping("/welcome")
  public String welcome() {
    return "Welcome";
  }
  @RequestMapping("/employees")
  public List<Employee> getAllEmployees(){
    return employeeService.getAllEmployee();
  }
}
