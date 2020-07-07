package com.piyushmehta.employeemanagementservice.dao;

import com.piyushmehta.employeemanagementservice.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The type Employee dao.
 */
@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
}
