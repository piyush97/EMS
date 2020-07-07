package com.piyushmehta.employeemanagementservice.service.implementations;

import com.piyushmehta.employeemanagementservice.dao.EmployeeDAO;
import com.piyushmehta.employeemanagementservice.dto.Employee;
import com.piyushmehta.employeemanagementservice.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Employee service.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

  /**
   * The Employee dao.
   */
  @Autowired
  private EmployeeDAO employeeDAO;

  /**
   * Gets all employee.
   *
   * @return the all employee
   */
  @Override
  public List<Employee> getAllEmployee() {
    return employeeDAO.findAll();
  }

  /**
   * Gets employee by id.
   *
   * @param employeeId the employee id
   * @return the employee by id
   */
  @Override
  public Employee getEmployeeById(final int employeeId) {
    return employeeDAO.getOne(employeeId);
  }

  /**
   * Add employee.
   *
   * @param employee the employee
   */
  @Override
  public void addEmployee(final Employee employee) {
    employeeDAO.save(employee);
  }

  /**
   * Update employee.
   *
   * @param employee the employee
   * @param empId    the emp id
   */
  @Override
  public void updateEmployee(final Employee employee,final int empId) {
    employeeDAO.save(employee);
  }

  /**
   * Delete employee.
   *
   * @param empId the emp id
   */
  @Override
  public void deleteEmployee(final int empId) {
    employeeDAO.deleteById(empId);
  }

  /**
   * Gets employee by department.
   *
   * @param departmentName the department name
   * @return the employee by department
   */
  @Override
  public List<Employee> getEmployeeByDepartment(final String departmentName) {
  return employeeDAO.findBydepartmentName(departmentName);
  }
}
