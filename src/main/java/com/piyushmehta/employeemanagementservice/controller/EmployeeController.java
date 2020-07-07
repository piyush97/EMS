package com.piyushmehta.employeemanagementservice.controller;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import com.piyushmehta.employeemanagementservice.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Employee controller.
 */
@RestController
public class EmployeeController {

  /**
   * The Employee service.
   */
  @Autowired
  EmployeeService employeeService;

  /**
   * Welcome string.
   *
   * @return the string
   */
  @RequestMapping("/welcome")
  public String welcome() {
    return "Welcome";
  }

  /**
   * Get all employees list.
   *
   * @return the list
   */
  @RequestMapping("/employees")
  public List<Employee> getAllEmployees() {
    return employeeService.getAllEmployee();
  }

  /**
   * Get employee by id employee.
   *
   * @param employeeId the employee id
   * @return the employee
   */
  @RequestMapping("/employees/{employeeId}")
  public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
    return employeeService.getEmployeeById(employeeId);
  }
  @RequestMapping(method = RequestMethod.POST, value = "/employees")
  public void addEmployee(@RequestBody Employee employee)
  {
    employeeService.addEmployee(employee);
  }
}
