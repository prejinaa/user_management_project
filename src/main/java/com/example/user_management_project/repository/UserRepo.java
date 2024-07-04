package com.example.user_management_project.repository;


import com.example.user_management_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<User,Integer> {
    public User findByEmail(String email);
    boolean existsByEmail(String email);
}
