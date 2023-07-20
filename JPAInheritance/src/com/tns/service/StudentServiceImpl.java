package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImpl;
import com.tns.entities.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}
	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student getStudent(int id) {
		return dao.getStudent(id);
	}

}
