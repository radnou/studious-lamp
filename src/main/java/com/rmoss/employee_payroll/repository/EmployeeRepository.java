package com.rmoss.employee_payroll.repository;
import com.rmoss.employee_payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}