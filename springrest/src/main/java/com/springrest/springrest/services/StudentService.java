package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Students;

public interface Studentservice {
	public List<Students> getStudents();
	
	public Students getCourse(long courseId);

	public Students addCourse(Students course);

	public Students updateCourse(Students course);

	public void deleteCourse(long parseLong);
}
