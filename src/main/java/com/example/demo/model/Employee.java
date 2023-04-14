package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employee_id;
	
	@NotBlank
	@Min(value = 2, message = "The first name must be greater than 2 letters")
	@Max(value = 30, message = "The first name must be less than 30 letters")
	private String firstName;
	
	@NotBlank
	@Min(value = 2, message = "The last name must be greater than 2 letters")
	@Max(value = 30, message = "The last name must be less than 30 letters")
	private String lastName;
	
	@Email
	private String email;

	@NotBlank
	private String phone;
	
	public Employee() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	

}
