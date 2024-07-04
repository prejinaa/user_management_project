package com.example.User_Management_Project.Service;


import com.example.User_Management_Project.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}