package com.piyushmehta.employeemanagementservice.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The type Project.
 */
@Entity
public class Project {

  @Id
  @GeneratedValue
  private int projectId;

  private String ProjectName;

  /**
   * Instantiates a new Project.
   */
  public Project() {
  }

  /**
   * Instantiates a new Project.
   *
   * @param projectId   the project id
   * @param projectName the project name
   */
  public Project(final int projectId, final String projectName) {
    this.projectId = projectId;
    ProjectName = projectName;
  }

  /**
   * Gets project id.
   *
   * @return the project id
   */
  public int getProjectId() {
    return projectId;
  }

  /**
   * Sets project id.
   *
   * @param projectId the project id
   */
  public void setProjectId(final int projectId) {
    this.projectId = projectId;
  }

  /**
   * Gets project name.
   *
   * @return the project name
   */
  public String getProjectName() {
    return ProjectName;
  }

  /**
   * Sets project name.
   *
   * @param projectName the project name
   */
  public void setProjectName(final String projectName) {
    ProjectName = projectName;
  }
}
