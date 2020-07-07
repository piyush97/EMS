package com.piyushmehta.employeemanagementservice.controller;

import com.piyushmehta.employeemanagementservice.dto.Project;
import com.piyushmehta.employeemanagementservice.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Project controller.
 */
@RestController
public class ProjectController {

  /**
   * The Project service.
   */
  @Autowired
  ProjectService projectService;

  /**
   * Get all projects list.
   *
   * @return the list
   */
  @RequestMapping("/projects")
  public List<Project> getAllProjects(){
    return projectService.getAllProjects();
  }

  /**
   * Add project.
   *
   * @param project the project
   */
  @RequestMapping(method = RequestMethod.POST, value = "/projects")
  public void addProject(@RequestBody Project project){
    projectService.addProject(project);
  }
}
