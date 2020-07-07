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

  /**
   * Add employee.
   *
   * @param employee the employee
   */
  void addEmployee(Employee employee);

  /**
   * Update employee.
   *
   * @param employee the employee
   * @param empId    the emp id
   */
  void updateEmployee(Employee employee, int empId);

  /**
   * Delete employee.
   *
   * @param empId the emp id
   */
  void deleteEmployee(int empId);

  /**
   * Gets employee by department.
   *
   * @param departmentName the department name
   * @return the employee by department
   */
  List<Employee> getEmployeeByDepartment(String departmentName);
}
