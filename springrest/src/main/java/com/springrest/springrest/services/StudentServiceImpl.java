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
	public Students getStudent(long studentId) {
		// TODO Auto-generated method stub
//		Students c = null;
//		for(Students course: list) {
//			if(course.getId() == courseId) {
//				c= course;
//				break;
//			}
//		}
		return studentDao.getOne(studentId);
	}

	@Override
	public Students addStudent(Students student) {
//		// TODO Auto-generated method stub
//		list.add(course);
		studentDao.save(student);
		return student;
	}

	@Override
	public Students updateStudent(Students student) {
		
		studentDao.save(student);
		return student;
	}

	@Override
	public void deleteStudent(long parseLong) {
		// TODO Auto-generated method stub
		Students entity = studentDao.getOne(parseLong);
		studentDao.delete(entity);
	}

}
