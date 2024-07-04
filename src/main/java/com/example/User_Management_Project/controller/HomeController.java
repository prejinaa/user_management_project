package com.example.User_Management_Project.controller;



import com.example.User_Management_Project.Service.UserService;
import com.example.User_Management_Project.entity.User;

import com.example.User_Management_Project.repository.UserRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller


public class HomeController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepo userRepo;

    @ModelAttribute
    public void commonUser(Principal p, Model m) {
        if (p != null) {
            String email = p.getName();
            User user = userRepo.findByEmail(email);
            m.addAttribute("user", user);
        }
    }


    @GetMapping("/")
    public String Index() {
        return "index";
    }

    @GetMapping("/signin")
    public String Login() {
        return "login";
    }

    @GetMapping("/register")
    public String Register() {
        return "register";
    }
//    @GetMapping("/user/profile")
//    public String profile(Principal p,Model m) {
//       String email = p.getName();
//       User user = userRepo.findByEmail(email);
//       m.addAttribute("user", user);
//       return "profile";
//    }
//    @GetMapping("/user/home")
//    public String getRegister() {
//        return "home";

//    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user, HttpSession session){
        boolean f= userService.checkByEmail(user.getEmail());
        if(f){
            session.setAttribute("msg","Email already exist");
        }
        else {
            User u = userService.saveUser(user);

            if (u != null) {
//            System.out.println("successfully register");
                session.setAttribute("msg", "Register successfully");
            } else {
//            System.out.println("some error");
                session.setAttribute("msg", "something wrong server");
            }
        }

        return "redirect:/register";
    }


}



