package com.piyushmehta.employeemanagementservice.dao;

import com.piyushmehta.employeemanagementservice.dto.Project;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Project dao.
 */
@Repository
public interface ProjectDAO extends JpaRepository<Project, Integer> {
}
