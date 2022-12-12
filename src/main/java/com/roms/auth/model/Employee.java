package com.roms.auth.model;

import org.springframework.data.annotation.Id;



import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;


@Container(containerName = "employee")

public class Employee {
	
	@PartitionKey
	private String EmpId;
	@Id
	private String id;
	private String companyname;
	private String designation;
	private double salary;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", id=" + id + ", companyname=" + companyname + ", designation="
				+ designation + ", salary=" + salary + "]";
	}
	public Employee(String empId, String id, String companyname, String designation, double salary) {
		super();
		EmpId = empId;
		this.id = id;
		this.companyname = companyname;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}