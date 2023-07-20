package com.hib.service;

import com.hib.dao.StudentDao;
import com.hib.dao.StudentDaoImpl;
import com.hib.entities.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}
	@Override
	public void addStudent(Student student) {
		dao.addStudent(student);
	}

	@Override
	public Student getStudent(int id) {
		return dao.getStudent(id);
	}

}
