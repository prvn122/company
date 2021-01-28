package com.css.corejava.dto;

import java.util.Arrays;
import java.util.HashMap;

public class Company {
	private int companyId;
	private Address empAddress;
	private Employee[] employees =new Employee[0];
	private HashMap<Integer,Employee> employeesMap;
	public Company(int companyId, Address empAddress, Employee[] employees, HashMap<Integer, Employee> employeesMap) {
		super();
		this.companyId = companyId;
		this.empAddress = empAddress;
		this.employees = employees;
		this.employeesMap = employeesMap;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	public HashMap<Integer, Employee> getEmployeesMap() {
		return employeesMap;
	}
	public void setEmployeesMap(HashMap<Integer, Employee> employeesMap) {
		this.employeesMap = employeesMap;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", empAddress=" + empAddress + ", employees="
				+ Arrays.toString(employees) + ", employeesMap=" + employeesMap + "]";
	}
	
	
	

}
