package com.rmoss.employee_payroll.utils.exception;

public class EmployeeNotFoundException extends RuntimeException {

  public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}