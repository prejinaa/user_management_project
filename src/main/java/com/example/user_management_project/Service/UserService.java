package com.example.user_management_project.Service;

import com.example.user_management_project.entity.User;

public interface UserService {


        public User saveUser(User user);

        public void removeSessionMessage();
        Boolean checkByEmail(String email);

    }
