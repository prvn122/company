package com.css.corejava.dto;

import java.util.HashMap;

public class Employee {
	private String empName;
	private int empId;
	private int age;
	private int salary;
	public Employee(String empName, int empId, int age, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
		


}
