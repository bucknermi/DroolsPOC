package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.*;

@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer> {
    
}
