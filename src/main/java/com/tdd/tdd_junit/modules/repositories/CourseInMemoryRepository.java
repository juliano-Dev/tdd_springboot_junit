package com.tdd.tdd_junit.modules.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.tdd.tdd_junit.modules.entities.Course;


public class CourseInMemoryRepository implements ICoursesRepository{


    private List<Course> courses;

    public CourseInMemoryRepository(){
        this.courses = new ArrayList<>();
    }

    @Override
    public Course findByName(String name) {
        Optional<Course> optionalCourse = this.courses.stream().filter(course -> course.getName().equals(name)).findFirst();
    
        return optionalCourse.orElse(null);
    }

    @Override
    public Course save(Course course) {
        this.courses.add(course);
        //insere ID manualmente, ja que nao usa banco
        course.setId(UUID.randomUUID());
        return course;
    }

    
    
}
