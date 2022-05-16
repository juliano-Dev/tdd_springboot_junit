package com.tdd.tdd_junit.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import com.tdd.tdd_junit.modules.entities.Course;
import com.tdd.tdd_junit.modules.repositories.CourseInMemoryRepository;
import com.tdd.tdd_junit.modules.services.CreateCourseService;

public class CreateCourseServiceTest {
    
    @Test
    public void create_course(){

        //criar  um novo curso
        //criar table curso (entidade)
        //ID, description, name, workload
        Course course = new Course();
        course.setDescription("Test Description");
        course.setName("Test Name");
        course.setWorkload(100);

        //criar repository de curso
        CourseInMemoryRepository repository = new CourseInMemoryRepository();
        

        //criar um novo service
        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);
        

        assertNotNull(createdCourse.getId());
        
    }  
    
    @Test
    public void not_create_course_if_exists(){
        
        Course course = new Course();
        course.setDescription("Not Create Course");
        course.setName("Not Createt Test Name");
        course.setWorkload(100);

         //criar repository de curso
         CourseInMemoryRepository repository = new CourseInMemoryRepository();
        

         //criar um novo service
         CreateCourseService createCourseService = new CreateCourseService(repository);
         createCourseService.execute(course);
         createCourseService.execute(course);
         


    }
        
}
