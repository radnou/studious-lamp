package com.rmoss.employee_payroll.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Employee setRole(String role) {
        this.role = role;
        return this;
    }
}
