package com.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.model.Salary;

@Service
public class SalaryService {
	private final KieContainer kieContainer;

	@Autowired
	public SalaryService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Salary getProductDiscount(Salary salary, Employee employee) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(salary);
		kieSession.insert(employee);
		kieSession.setGlobal("SalaryService", this);
		kieSession.fireAllRules();
		kieSession.dispose();
		return salary;
	}
	

}
	
