package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.Salary;
import com.service.SalaryService;

@RestController
public class SalaryController {

	private final SalaryService salaryService;

	@Autowired
	public SalaryController(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	@GetMapping("/getSalaryAmount/{type}/employeeLevel/{employeeLevel}")
	public Salary getQuestions(@PathVariable("type") String type,@PathVariable("employeeLevel") int employeeLevel) {
		
		Salary product = new Salary();
		product.setType(type);
		Employee employee=new Employee();
		employee.setEmployeeLevel(employeeLevel);
		salaryService.getProductDiscount(product,employee);
		return product;
	}
}