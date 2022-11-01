package com.course1.javacourse.contoller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course1.javacourse.bean.Course;


@RestController
public class Controller {
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"JAVA TECH","Kishore"),new Course(2,"PYTHON TECH","Sai"));
	}
	
	@GetMapping("/courses/1")
	public Course getCourseDetails() {
		return new Course(1,"JAVA TECH","Kishore");
	}
	
}
