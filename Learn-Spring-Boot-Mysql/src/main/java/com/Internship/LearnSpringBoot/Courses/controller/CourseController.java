package com.Internship.LearnSpringBoot.Courses.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Internship.LearnSpringBoot.Courses.domain.Course;
import com.Internship.LearnSpringBoot.Courses.repository.CourseRepository;

@RestController
public class CourseController {
	@Autowired
	private CourseRepository repository;
	
	@RequestMapping(value = "/Courses", method = RequestMethod.GET)
	// get list of all courses
	public List<Course> getAllCourses()
	{
		 return repository.findAll();
		
		
		 
	}
	
	
	//Get total count of course
	
	 @GetMapping("/Courses/count")
		 public  String countCourses()
		    {
			    return "Total Number of Courses are: [ "+repository.count()+"]";
		    }

		//Get course by id
			
	@GetMapping("/Courses/{id}")
		public Course getCourses101(@PathVariable Long id)
			{
			Optional<Course> course = repository.findById(id);
			if(course.isEmpty())
				{
					throw new RuntimeException("No Course exist by this id = "+id);
				}
				else {
					return course.get();
				}
			}
   //Post==> adding a course
    
	
    
    @PostMapping("/Courses")
	public void createCourse(@RequestBody Course course )
	{
		repository.save(course);
		
 	}
    
    //put ==> update Courses
    
    @PutMapping("/Courses/{id}")
   	public void updateCourse(@PathVariable Long id,@RequestBody Course course )
   	{
   		repository.save(course);
   		
    	}
    
    //Delete ==> delete a resource/course 
    
    
    @DeleteMapping("/Courses/{id}")
   	public void DeleteCourse(@PathVariable Long id )
   	{
   		repository.deleteById(id);
   		
    	}
    
}
