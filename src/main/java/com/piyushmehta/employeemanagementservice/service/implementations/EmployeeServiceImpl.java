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

  @Autowired
  private EmployeeDAO employeeDAO;

  @Override
  public List<Employee> getAllEmployee() {
    return employeeDAO.findAll();
  }

  @Override
  public Employee getEmployeeById(final int employeeId) {
    return employeeDAO.getOne(employeeId);
  }

  @Override
  public void addEmployee(final Employee employee) {
    employeeDAO.save(employee);
  }

  @Override
  public void updateEmployee(final Employee employee,final int empId) {
    employeeDAO.save(employee);
  }

  @Override
  public void deleteEmployee(final int empId) {
    employeeDAO.deleteById(empId);
  }

  @Override
  public List<Employee> getEmployeeByDepartment(final String departmentName) {
  return employeeDAO.findBydepartmentName(departmentName);
  }
}
