package com.piyushmehta.employeemanagementservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @RequestMapping("/welcome")
  public String welcome() {
    return "Welcome";
  }
}
