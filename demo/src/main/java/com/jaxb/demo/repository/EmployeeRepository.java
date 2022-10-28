package com.jaxb.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaxb.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public ArrayList<Employee> findAllByOrderByEmployeeSalaryDesc();
}
