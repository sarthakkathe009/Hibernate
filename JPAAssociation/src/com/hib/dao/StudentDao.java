package com.hib.dao;

import com.hib.entities.Student;

public interface StudentDao {
	void addStudent(Student student);
	Student getStudent(int id);
}
