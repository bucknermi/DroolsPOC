package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	private String name;
	private String type;
	private String skill;
	private int employeeLevel;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill=skill;
	}
	
	public int getEmployeeLevel() {
		return employeeLevel;
	}
	public void setEmployeeLevel(int employeeLevel) {
		this.employeeLevel = employeeLevel;
	}
	
	
	
	public Employee() {
		super();
	}
	public Employee(Long id, String name, String type, String skill, int employeeLevel) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.employeeLevel = employeeLevel;
	}
	public Employee(Long id, String type, String skill, int employeeLevel) {
		super();
		this.id = id;
		this.type = type;
		this.skill = skill;
		this.employeeLevel = employeeLevel;
	}
	public Employee(String type, String skill, int employeeLevel) {
		super();
		this.type = type;
		this.skill = skill;
		this.employeeLevel = employeeLevel;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", type=" + type + ", skill=" + skill + ", employeeLevel="
				+ employeeLevel + "]";
	}
	
	
	
	
	
	
	
	
	
}
