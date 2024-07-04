package com.example.User_Management_Project.repository;


import com.example.User_Management_Project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<User,Integer> {
    public User findByEmail(String email);
    boolean existsByEmail(String email);
}
