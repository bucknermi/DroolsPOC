package com.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.Salary;
import com.repo.SalaryRepo;
import com.service.SalaryService;

@RestController
public class SalaryController {

	private final SalaryService salaryService;
	private final SalaryRepo salaryRepo;

	@Autowired
	public SalaryController(SalaryService salaryService, SalaryRepo salaryRepo) {
		this.salaryService = salaryService;
		this.salaryRepo = salaryRepo;
	}

	@GetMapping("/getSalaryAmount/{type}/employeeLevel/{employeeLevel}")
	public Salary getQuestions(@PathVariable("type") String type, @PathVariable("employeeLevel") int employeeLevel) {
		
		Salary salary = new Salary();
		salary.setType(type);
		Employee employee=new Employee();
		employee.setEmployeeLevel(employeeLevel);
		salaryService.getProductDiscount(salary,employee);

		salaryRepo.save(salary);

		return salary;
	}


}