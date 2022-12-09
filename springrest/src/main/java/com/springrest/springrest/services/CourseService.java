package com.springrest.springrest.services;
import java.util.List;

import com.springrest.springrest.entities.*;
public interface CourseService {
	public List<Courses> getCourses();

	public Courses addCourses(Courses courses);

	public Courses updateCourses(Courses courses);

	public void deleteCourses(long parseLong);

	public Courses getCourse(long parseLong);
}
