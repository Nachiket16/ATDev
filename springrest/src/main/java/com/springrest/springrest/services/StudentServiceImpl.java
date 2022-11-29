package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Students;
@Service
public class StudentserviceImpl implements Studentservice {

	@Autowired
	private StudentDao studentDao;
	
//	List<Students> list;

	public StudentserviceImpl() {
//		list = new ArrayList<Students>();
//		list.add(new Students(145, "Java Course", "This is OOP with Java"));
//		list.add(new Students(4545, "Spring Boot Course", "This is Web dev using spring Framework"));
	}

	@Override
	public List<Students> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Students getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Students c = null;
//		for(Students course: list) {
//			if(course.getId() == courseId) {
//				c= course;
//				break;
//			}
//		}
		return studentDao.getOne(courseId);
	}

	@Override
	public Students addCourse(Students course) {
//		// TODO Auto-generated method stub
//		list.add(course);
		studentDao.save(course);
		return course;
	}

	@Override
	public Students updateCourse(Students course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId()== course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		studentDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list =  this.list.stream()
//			    .filter(l -> l.getId()!= parseLong)
//			    .collect(Collectors.toList());
		Students entity = studentDao.getOne(parseLong);
		studentDao.delete(entity);
	}

}
