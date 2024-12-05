package com.springboot.project.service;

import com.springboot.project.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getStudents() ;
    Student updateStudent(Student student , Long id) ;
    Student addStudent(Student student) ;
    Student getStudentById(Long id) ;
    void deleteStudent(Long id) ;


}
