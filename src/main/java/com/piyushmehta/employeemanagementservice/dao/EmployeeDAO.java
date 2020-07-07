package com.piyushmehta.employeemanagementservice.dao;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The type Employee dao.
 */
@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
  /**
   * Find bydepartment name list.
   *
   * @param departmentName the department name
   * @return the list
   */
  List<Employee> findBydepartmentName(String departmentName);
}
