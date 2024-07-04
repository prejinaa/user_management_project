package com.example.User_Management_Project.repository;


import com.example.User_Management_Project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface StudentRepository extends JpaRepository<Student,Long> {

}
