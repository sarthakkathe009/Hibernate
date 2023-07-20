package com.tns.service;

import com.tns.entities.Student;

public interface StudentService {
	void addStudent(Student student);
	Student getStudent(int id);
}
