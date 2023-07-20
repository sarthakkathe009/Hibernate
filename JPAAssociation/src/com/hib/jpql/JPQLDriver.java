package com.hib.jpql;

import java.util.List;

public class JPQLDriver {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Sachin");
		emp.setSalary(500000);
		emp.setDepartmentName("Sales");
		EmployeeService.addEmployee(emp);
		
		emp=new Employee();
		emp.setId(102);
		emp.setName("Pankaj");
		emp.setSalary(450000);
		emp.setDepartmentName("Account");
		EmployeeService.addEmployee(emp);
		
		emp=new Employee();
		emp.setId(103);
		emp.setName("Rahul");
		emp.setSalary(800000);
		emp.setDepartmentName("Class 1");
		EmployeeService.addEmployee(emp);
		
		emp=new Employee();
		emp.setId(104);
		emp.setName("Manoj");
		emp.setSalary(600000);
		emp.setDepartmentName("Sales");
		EmployeeService.addEmployee(emp);
		
		List<Employee> list=EmployeeService.getEmployeeByDepartment("Sales");
		System.out.println(list);
		System.out.println("---------------------------------------");
		
		list=EmployeeService.getAllEmployeeWithinSalaryRange(250000,550000);
		System.out.println(list);
		System.out.println("---------------------------------------");
		
		int n=EmployeeService.updateSalaryOfAllEmployee("Account");
		if(n>0)
			System.out.println(n+" Record Updated");
		System.out.println("---------------------------------------");
		
		list=EmployeeService.getAllEmployee();
		System.out.println(list);
		System.out.println("---------------------------------------");
		
	}

}
