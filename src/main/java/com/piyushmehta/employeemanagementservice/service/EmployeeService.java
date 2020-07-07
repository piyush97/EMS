package com.piyushmehta.employeemanagementservice.service;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import java.util.List;

/**
 * The interface Employee service.
 */
public interface EmployeeService {
  /**
   * Gets all employee.
   *
   * @return the all employee
   */
  List<Employee> getAllEmployee();

  /**
   * Gets employee by id.
   *
   * @param employeeId the employee id
   * @return the employee by id
   */
  Employee getEmployeeById(int employeeId);

  void addEmployee(Employee employee);
}
