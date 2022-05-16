package com.tdd.tdd_junit.modules.repositories;

import com.tdd.tdd_junit.modules.entities.Course;

public interface ICoursesRepository {

    public Course findByName(String name);
    public Course save(Course course);
    
}
