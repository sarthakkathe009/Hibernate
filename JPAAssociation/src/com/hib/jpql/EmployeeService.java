package com.hib.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.hib.dao.JPAUtil;

@SuppressWarnings("all")
public class EmployeeService {
	private static EntityManager em;
	
	static {
		em=JPAUtil.getEntityManager();
	}
	
	public static void addEmployee(Employee employee) {
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		System.out.println("Record Added");
	}
	
	public static void updateEmployee(Employee employee) {
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		System.out.println("Record Updated");
	}
	
	public static void removeEmployee(Employee employee) {
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
		System.out.println("Record Deleted");
	}
	
	public static Employee getEmployee(int id) {
		Employee e= em.find(Employee.class,id);
		return e;
	}
	
	//List of all Employee working in given Department
	public static List<Employee> getEmployeeByDepartment(String departmentName){
		List<Employee> emplist=null;
		String qstr="SELECT e FROM Employee e WHERE departmentName='"+departmentName+"'";
		TypedQuery query=em.createQuery(qstr,Employee.class);
		emplist=query.getResultList();
		return emplist;
	}
	
	//Update salary of all Employees working on given department
	public static int updateSalaryOfAllEmployee(String departmentName){
		String qstr="UPDATE Employee e SET salary=salary+salary*0.10 WHERE departmentName='"+departmentName+"'";
		Query query=em.createQuery(qstr);
		em.getTransaction().begin();
		int n=query.executeUpdate();
		em.getTransaction().commit();
		return n;
	}
	
	//List of all Employees in given range
	public static List<Employee> getAllEmployeeWithinSalaryRange(double s1,double s2) {
		List<Employee> emplist=null;
		String qstr="SELECT e FROM Employee e WHERE e.salary BETWEEN :start AND :end";
		TypedQuery query=em.createQuery(qstr,Employee.class);
		query.setParameter("start",s1);
		query.setParameter("end",s2);
		emplist=query.getResultList();
		return emplist;
	}
	
	//List of all Employees
	public static List<Employee> getAllEmployee(){
		List<Employee> emplist=null;
		TypedQuery query=em.createNamedQuery("getAllEmployees",Employee.class);
		emplist=query.getResultList();
		return emplist;
	}
}
