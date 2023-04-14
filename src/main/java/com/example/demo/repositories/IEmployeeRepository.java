package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
	
	

}
