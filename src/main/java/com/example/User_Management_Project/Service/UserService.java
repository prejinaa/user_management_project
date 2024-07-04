package com.example.User_Management_Project.Service;

import com.example.User_Management_Project.entity.User;

public interface UserService {


        public User saveUser(User user);

        public void removeSessionMessage();
        Boolean checkByEmail(String email);

    }
