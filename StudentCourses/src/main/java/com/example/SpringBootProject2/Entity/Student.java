package com.example.SpringBootProject2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Student_Tbl")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String dept;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_course_table",
            joinColumns = {
                    @JoinColumn(name = "student_id",referencedColumnName = "id"),
            },
            inverseJoinColumns={
                    @JoinColumn(name = "course_code", referencedColumnName = "course_code")
            }
    )
    private Set<Courses> courses;
}