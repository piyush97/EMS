package com.piyushmehta.employeemanagementservice.service;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
  List<Employee> employeeList =
  Arrays.asList(
      new Employee(1,"Tech",
          "Mehta"),
        new Employee(2,"Tech","Mehta")
    );

  public List<Employee> getAllEmployee() {
    return employeeList;
  }
}
