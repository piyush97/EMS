package com.piyushmehta.employeemanagementservice.service;

import com.piyushmehta.employeemanagementservice.dto.Project;
import java.util.List;

/**
 * The interface Project service.
 */
public interface ProjectService {
  /**
   * Gets all projects.
   *
   * @return the all projects
   */
  List<Project> getAllProjects();

  /**
   * Add project.
   *
   * @param project the project
   */
  void addProject(Project project);

  /**
   * Gets project id.
   *
   * @param projectId the project id
   * @return the project id
   */
  Project getProjectId(int projectId);
}
