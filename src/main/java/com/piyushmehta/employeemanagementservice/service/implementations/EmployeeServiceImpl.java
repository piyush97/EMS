package com.piyushmehta.employeemanagementservice.service.implementations;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import com.piyushmehta.employeemanagementservice.service.EmployeeService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * The type Employee service.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
  /**
   * The Employee list.
   */
  List<Employee> employeeList =
      new ArrayList<>(Arrays.asList(
          new Employee(1, "Tech",
              "Mehta"),
          new Employee(2, "Tech", "Mehta")
      ));

  @Override
  public List<Employee> getAllEmployee() {
    return employeeList;
  }

  @Override
  public Employee getEmployeeById(final int employeeId) {
    return employeeList.stream().filter(e -> e.getEmployeeId() == employeeId).findFirst().get();
  }

  @Override
  public void addEmployee(final Employee employee) {
    employeeList.add(employee);
  }

  @Override
  public void updateEmployee(final Employee employee,final int empId) {
    for( int i = 0; i < employeeList.size(); i++ ) {
      Employee e = employeeList.get(i);
      if(e.getEmployeeId() == empId){
        employeeList.set(i,employee);
        return;
      }
    }
  }

  @Override
  public void deleteEmployee(final int empId) {

  }
}
