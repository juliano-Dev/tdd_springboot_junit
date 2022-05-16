package com.tdd.tdd_junit.modules.repositories;

import com.tdd.tdd_junit.modules.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRepository implements ICoursesRepository{

    @Autowired
    CourseJPARepository courseJPARepository;


    @Override
    public Course findByName(String name) {
        return this.courseJPARepository.findByName(name); 
    }

    @Override
    public Course save(Course course) {
        return this.courseJPARepository.save(course);
    }
    
}
