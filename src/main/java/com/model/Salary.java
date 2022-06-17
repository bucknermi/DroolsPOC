package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private String type;
	private int salaryAmount;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSalaryAmount() {
		return salaryAmount;
	}

	public void setSalaryAmount(int salaryAmount) {
		this.salaryAmount = salaryAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}