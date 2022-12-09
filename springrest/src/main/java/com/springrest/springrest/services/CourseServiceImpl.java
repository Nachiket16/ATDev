package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Courses addCourses(Courses courses) {
		courseDao.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourses(Courses courses) {
		// TODO Auto-generated method stub
		courseDao.save(courses);
		return courses;
	}

	@Override
	public void deleteCourses(long parseLong) {
		// TODO Auto-generated method stub
		Courses entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

	@Override
	public Courses getCourse(long parseLong) {
		// TODO Auto-generated method stub
		
		return courseDao.getOne(parseLong);
	}

}
