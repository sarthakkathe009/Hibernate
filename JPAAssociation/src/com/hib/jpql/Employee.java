package com.hib.jpql;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@SuppressWarnings("serial")
@Entity
@NamedQueries(@NamedQuery(name="getAllEmployees", query="SELECT e FROM Employee e"))
public class Employee implements Serializable  {
	@Id
	private int id;
	private String name;
	private double salary;
	private String departmentName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departmentName=" + departmentName
				+ "]";
	}
	
	
}
//The hibernate named query is way to use any query by some meaningful name.
//The Hibernate framework provides the concept of named queries so that application programmer 
//need not to scatter queries to all the java code.