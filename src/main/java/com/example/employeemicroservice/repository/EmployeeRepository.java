package com.example.employeemicroservice.repository;

import com.example.employeemicroservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
}
