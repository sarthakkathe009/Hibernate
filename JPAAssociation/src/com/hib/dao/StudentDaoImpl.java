package com.hib.dao;

import javax.persistence.EntityManager;

import com.hib.entities.Student;

public class StudentDaoImpl implements StudentDao{
	private EntityManager em;
	public StudentDaoImpl() {
		em=JPAUtil.getEntityManager();
	}
	@Override
	public void addStudent(Student student) {
		JPAUtil.beginTransaction();
		em.persist(student);
		JPAUtil.commitTransaction();
	}

	@Override
	public Student getStudent(int id) {
		Student s=em.find(Student.class,id);
		return s;
	}

}
