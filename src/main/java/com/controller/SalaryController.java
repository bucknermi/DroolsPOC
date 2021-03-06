package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.Salary;
import com.repo.SalaryRepo;
import com.service.SalaryService;

@RestController
public class SalaryController {

	private final SalaryService salaryService;

	@Autowired
	public SalaryController(SalaryService salaryService) {
		this.salaryService = salaryService;
	}
	
	@Autowired
	SalaryRepo salaryRepo;

	@GetMapping("/getSalaryAmount/{type}/employeeLevel/{employeeLevel}")
	public Salary getQuestions(@PathVariable("type") String type,@PathVariable("employeeLevel") int employeeLevel) {
		
		Salary salary = new Salary();
		salary.setType(type);
		Employee employee=new Employee();
		employee.setEmployeeLevel(employeeLevel);
		salaryService.getEmployeeSalary(salary,employee);
		salaryRepo.save(salary);
		return salary;
	}
}