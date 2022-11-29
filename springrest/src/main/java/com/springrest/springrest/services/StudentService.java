package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Students;

public interface Studentservice {
	public List<Students> getStudents();
	
	public Students getStudent(long studentId);

	public Students addStudent(Students student);

	public Students updateStudent(Students student);

	public void deleteStudent(long parseLong);
}
