package com.piyushmehta.employeemanagementservice.dto;

/**
 * The type Employee.
 */
public class Employee {
  private int employeeId;
  private String departmentName;
  private String employeeName;

  /**
   * Instantiates a new Employee.
   *
   * @param employeeId     the employee id
   * @param departmentName the department name
   * @param employeeName   the employee name
   */
  public Employee(
      final int employeeId,
      final String departmentName,
      final String employeeName
  ) {
    super();
    this.employeeId = employeeId;
    this.departmentName = departmentName;
    this.employeeName = employeeName;
  }

  /**
   * Instantiates a new Employee.
   */
  public Employee() {
  }

  /**
   * Gets employee id.
   *
   * @return the employee id
   */
  public int getEmployeeId() {
    return employeeId;
  }

  /**
   * Sets employee id.
   *
   * @param employeeId the employee id
   */
  public void setEmployeeId(final int employeeId) {
    this.employeeId = employeeId;
  }

  /**
   * Gets department name.
   *
   * @return the department name
   */
  public String getDepartmentName() {
    return departmentName;
  }

  /**
   * Sets department name.
   *
   * @param departmentName the department name
   */
  public void setDepartmentName(final String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Gets employee name.
   *
   * @return the employee name
   */
  public String getEmployeeName() {
    return employeeName;
  }

  /**
   * Sets employee name.
   *
   * @param employeeName the employee name
   */
  public void setEmployeeName(final String employeeName) {
    this.employeeName = employeeName;
  }
}
