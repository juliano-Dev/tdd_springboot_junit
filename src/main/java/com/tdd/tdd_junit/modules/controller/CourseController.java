package com.tdd.tdd_junit.modules.controller;

import com.tdd.tdd_junit.modules.entities.Course;
import com.tdd.tdd_junit.modules.repositories.CourseRepository;
import com.tdd.tdd_junit.modules.services.CreateCourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController{

    @Autowired
    private CourseRepository repository;

    @PostMapping("/")
    public Course createCourse(@RequestBody Course course){
        CreateCourseService createCourseService = new CreateCourseService(repository);
        return createCourseService.execute(course);
    }
    
}
