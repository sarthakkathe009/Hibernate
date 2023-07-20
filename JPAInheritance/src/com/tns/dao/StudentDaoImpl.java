package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.Student;

public class StudentDaoImpl implements StudentDao{
	private EntityManager em;
	public StudentDaoImpl() {
		em=JPAUtil.getEntityManager();
	}
	@Override
	public void addStudent(Student student) {
		em.persist(student);
	}

	@Override
	public Student getStudent(int id) {
		Student s=em.find(Student.class,id);
		return s;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}

}
