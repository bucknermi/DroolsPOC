package com.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.model.Salary;
import com.repo.SalaryRepo;

@Service
public class SalaryService {
	private final KieContainer kieContainer;

	@Autowired
	public SalaryService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	@Autowired
	SalaryRepo salaryRepo;

	public Salary getEmployeeSalary(Salary salary, Employee employee) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(salary);
		kieSession.insert(employee);
		kieSession.setGlobal("SalaryService", this);
		kieSession.fireAllRules();
		kieSession.dispose();
		return salary;
	}

	public Salary getEmployeeSalaryJava(Salary salary, Employee employee) {
		if (employee.getType() == "new") {
			if (employee.getSkill() == "java") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(50000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(60000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(70000);
					return salary;
				}
			}
			if (employee.getSkill() == "python") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(55000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(65000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(75000);
					return salary;
				}
			}
			if (employee.getSkill() == "javascript") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(70000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(80000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(90000);
					return salary;
				}
			}

		}
		if (employee.getType() == "experienced") {
			if (employee.getSkill() == "java") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(80000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(90000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(100000);
					return salary;
				}
			}
			if (employee.getSkill() == "python") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(85000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(95000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(105000);
					return salary;
				}
			}
			if (employee.getSkill() == "javascript") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(90000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(100000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(110000);
					return salary;
				}
			}
			return salary;

		}

		if (employee.getType() == "senior") {
			if (employee.getSkill() == "java") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(100000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(110000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(120000);
					return salary;
				}
			}
			if (employee.getSkill() == "python") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(105000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(115000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(125000);
					return salary;
				}
			}
			if (employee.getSkill() == "javascript") {
				if (employee.getEmployeeLevel() == 1) {
					salary.setSalaryAmount(110000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 2) {
					salary.setSalaryAmount(120000);
					return salary;
				}
				if (employee.getEmployeeLevel() == 3) {
					salary.setSalaryAmount(130000);
					return salary;
				}
			}

		}
		return salary;

	}

	public void saveSalary(Salary salary) {
		salaryRepo.save(salary);
	}

}
