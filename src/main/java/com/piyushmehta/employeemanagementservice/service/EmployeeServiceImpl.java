package com.piyushmehta.employeemanagementservice.service;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * The type Employee service.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
  /**
   * The Employee list.
   */
  List<Employee> employeeList =
  Arrays.asList(
      new Employee(1,"Tech",
          "Mehta"),
        new Employee(2,"Tech","Mehta")
    );

  @Override
  public List<Employee> getAllEmployee() {
    return employeeList;
  }

  @Override
  public Employee getEmployeeById(final int employeeId) {
    return employeeList.stream.filter(e -> e.getEmployeeId() == employeeId.findFirst().get());
  }
}
