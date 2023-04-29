package com.Internship.LearnSpringBoot.Courses.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Internship.LearnSpringBoot.Courses.repository.CourseRepository;

@Service

public class CourseService {
	@Autowired
	private CourseRepository repository;
	
	
}
