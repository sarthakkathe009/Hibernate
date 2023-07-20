package com.tns.dao;

import com.tns.entities.Student;

public interface StudentDao {
	void addStudent(Student student);
	Student getStudent(int id);
	void beginTransaction();
	void commitTransaction();
}
