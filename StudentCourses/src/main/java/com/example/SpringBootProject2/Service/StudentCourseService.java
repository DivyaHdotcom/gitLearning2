package com.example.SpringBootProject2.Service;

import com.example.SpringBootProject2.Entity.Courses;
import com.example.SpringBootProject2.Entity.Student;
import com.example.SpringBootProject2.Repository.StudentRepository;
import com.example.SpringBootProject2.Repository.CoursesRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentCourseService {
    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private CoursesRepository coursesRepo;

    public StudentCourseService(StudentRepository studentRepo, CoursesRepository subjectRepo) {
        this.studentRepo = studentRepo;
        this.coursesRepo = subjectRepo;
    }

    //save
    public Student saveStudentwithCourse(Student student){

        return studentRepo.save(student);
    }

    //read
    public List<Student> findAllStudents(){

        return studentRepo.findAll();
    }

    public Student findStudent(Integer id){
        return studentRepo.findById(id).orElse(null);
    }

    public List<Courses> findAllCourses(){

        return coursesRepo.findAll();
    }
    public Courses saveStudentwithCourse(Courses courses){
        return coursesRepo.save(courses);
    }

}
