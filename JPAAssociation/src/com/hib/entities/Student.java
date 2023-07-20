package com.hib.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student{
	@Id
	private int rollNo;
	private String name;
	private String course;
	private float per;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [RollNo=" + rollNo + ", Name=" + name + ", Course=" + course + ", Per=" + per + "]";
	}
	
}
