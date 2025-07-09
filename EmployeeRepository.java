package com.firstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapp.controller.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
