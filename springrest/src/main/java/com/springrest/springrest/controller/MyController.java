package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Students;
import com.springrest.springrest.services.Studentservice;

@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController					//Main Orders manager
public class MyController {
	//After Request come we will manage using methods
	@Autowired
	private Studentservice studentService;
	
	@GetMapping("/home")		//Accept Get @ /home url
	public String home() {
		return "Welcome To my Student Home Page";
	}
	
	//get the Students
	@GetMapping("/students")
	public List<Students> getStudents(){
		return this.studentService.getStudents();
	}
	
	
	@GetMapping("/students/{studentId}")
	public Students getCourse(@PathVariable String studentId) {
		return this.studentService.getCourse(Long.parseLong(studentId));
	}
	
	@PostMapping("/student")
	public Students addCourse(@RequestBody Students course) {
		return this.studentService.addCourse(course);
	}
	
	@PutMapping("/student/{studentId}")
	public Students updateCourse(@RequestBody Students course) {
		return this.studentService.updateCourse(course);
	}
	
	@DeleteMapping("/student/{studentId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.studentService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
