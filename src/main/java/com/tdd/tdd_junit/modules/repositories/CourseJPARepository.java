package com.tdd.tdd_junit.modules.repositories;

import java.util.UUID;

import com.tdd.tdd_junit.modules.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseJPARepository extends JpaRepository<Course, UUID>{

    public Course findByName(String name);

}
