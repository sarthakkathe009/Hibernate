package com.hib.service;

import com.hib.entities.Student;

public interface StudentService {
	void addStudent(Student student);
	Student getStudent(int id);
}
