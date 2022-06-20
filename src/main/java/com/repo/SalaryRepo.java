package com.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Salary;
import com.service.SalaryService;



@Repository
public interface SalaryRepo extends JpaRepository<Salary, Long>{
		

}
