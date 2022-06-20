package com;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controller.SalaryController;
import com.model.Employee;
import com.model.Salary;
import com.repo.SalaryRepo;
import com.service.SalaryService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ExampleDroolsPOCTests {

	@Autowired
	SalaryService salaryService;
	
	@Autowired
	SalaryRepo salaryRepo;
	
	@Autowired
	SalaryController salaryController;

	
	String[] skill = {"java", "python", "javascript"};
	int[] level = {1, 2, 3};
	String[] type = {"new", "experienced", "senior"};
	int j;
	int k;
	int l;
	
	@Test
	public void DroolsTest() {
		for(int i=0; i<50; i++) {
		Salary salary = new Salary();
		Random random = new Random();
		j = random.nextInt(3);
		Employee employee = new Employee((long) i, type[j], skill[k], level[l]);
		Salary finalSalary = new Salary();
		salary.setType(employee.getType());
		salary.setId(employee.getId());
		finalSalary = salaryService.getEmployeeSalary(salary, employee);
		System.out.println(finalSalary.toString());
		System.out.println(employee.toString());
		}
		
	}
	
	@Test
	public void JavaTest() {
		for(int i=0; i<50; i++) {
		Salary salary = new Salary();
		Random random = new Random();
		j = random.nextInt(3);
		Employee employee = new Employee((long) i, type[j], skill[k], level[l]);
		Salary finalSalary = new Salary();
		salary.setType(employee.getType());
		salary.setId(employee.getId());
		finalSalary = salaryService.getEmployeeSalary(salary, employee);
		System.out.println(finalSalary.toString());
		System.out.println(employee.toString());
		}
	}
}
