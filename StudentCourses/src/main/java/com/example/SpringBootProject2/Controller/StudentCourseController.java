package com.example.SpringBootProject2.Controller;

import com.example.SpringBootProject2.Entity.Courses;
import com.example.SpringBootProject2.Entity.Student;
import com.example.SpringBootProject2.Service.StudentCourseService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentCourseController {

    @Autowired
    private StudentCourseService service;

    @PostMapping("/s")
    public Student saveStudentwithCourse(@RequestBody Student student){
        return service.saveStudentwithCourse(student);
    }

    @PostMapping("/c")
    public Courses saveStudentwithCourse(@RequestBody Courses courses){
        return service.saveStudentwithCourse(courses);
    }

    @GetMapping("/s")
    public List<Student> findAllStudents(){
    return service.findAllStudents();
    }

    @GetMapping("/c")
    public List<Courses> findAllCourses(){
        return service.findAllCourses();
    }
    @GetMapping("/{student_id}")
    public Student findStudent(@PathVariable int id){
        return service.findStudent(id);
    }
}
