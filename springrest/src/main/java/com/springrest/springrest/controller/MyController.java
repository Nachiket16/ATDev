package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;


@RestController
public class MyController {
	//Services obj will call impl method 
	//Get, post, put , delet
	//obj of course is req to call the method
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Hello get api called on the local host";
	}
	
	//Return list<Courses> will be resturn from the DB
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses courses) {
		return this.courseService.addCourses(courses);
	}
	
	@PutMapping("/courses/{courseId}")
	public Courses updateCourses(@RequestBody Courses courses) {
		return this.courseService.updateCourses(courses);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId) {
		try {
			this.courseService.deleteCourses(Long.parseLong(courseId));
			return new  ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
