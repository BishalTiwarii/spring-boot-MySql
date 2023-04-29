package com.Internship.LearnSpringBoot.Courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Internship.LearnSpringBoot.Courses.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>
{

}
