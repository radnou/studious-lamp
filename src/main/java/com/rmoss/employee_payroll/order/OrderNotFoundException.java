package com.rmoss.employee_payroll.order;

public class OrderNotFoundException extends RuntimeException {

  public OrderNotFoundException(Long id) {
    super("Could not find order " + id);
  }
}