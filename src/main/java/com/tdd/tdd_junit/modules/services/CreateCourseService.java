package com.tdd.tdd_junit.modules.services;

import com.tdd.tdd_junit.modules.entities.Course;
//import com.tdd.tdd_junit.modules.repositories.CourseJPARepository;
import com.tdd.tdd_junit.modules.repositories.ICoursesRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseService {

    private ICoursesRepository repository;

    public CreateCourseService(ICoursesRepository repository){
        this.repository = repository;
    }
   
    public Course execute(Course course){

        
        //validar se curso existe
        Course existedCourse = this.repository.findByName(course.getName());
        
        // se sim - retorna erro
        if(existedCourse != null){throw new Error("Curso já existe.");}
        
        // se não - retorna novo curso
        return repository.save(course);
    }
    
}
