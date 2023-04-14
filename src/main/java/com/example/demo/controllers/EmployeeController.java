package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.repositories.IEmployeeRepository;

@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	@Autowired
	 IEmployeeRepository employeeRepo;
	
	
	@GetMapping("/add")
	public String getAddEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new-employee";
		
	}
	
	@PostMapping("/save")
	public String addEmployee(@Valid Employee employee) {
		employeeRepo.save(employee);
		return "redirect:/employee/";
	}
	
	@GetMapping
	public String getAllEmployees(Model model) {
		List<Employee> employees = employeeRepo.findAll(); 
		model.addAttribute("employees", employees );
		return "all-employees";
	}

}
