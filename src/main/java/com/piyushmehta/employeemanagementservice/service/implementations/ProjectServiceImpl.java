package com.piyushmehta.employeemanagementservice.service.implementations;

import com.piyushmehta.employeemanagementservice.dao.ProjectDAO;
import com.piyushmehta.employeemanagementservice.dto.Project;
import com.piyushmehta.employeemanagementservice.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Project service.
 */
@Service
public class ProjectServiceImpl implements ProjectService {
  /**
   * The Project dao.
   */
  @Autowired
  ProjectDAO projectDAO;


  /**
   * Gets all projects.
   *
   * @return the all projects
   */
  @Override
  public List<Project> getAllProjects() {
    return projectDAO.findAll();
  }

  /**
   * Add project.
   *
   * @param project the project
   */
  @Override
  public void addProject(final Project project) {
    projectDAO.save(project);
  }

}
