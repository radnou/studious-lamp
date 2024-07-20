package com.rmoss.employee_payroll.repository;

import com.rmoss.employee_payroll.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}