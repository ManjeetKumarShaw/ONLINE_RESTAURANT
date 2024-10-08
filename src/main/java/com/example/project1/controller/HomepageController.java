package com.example.project1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import com.example.project1.entities.User;
import com.example.project1.services.UserService;

@Controller
@RequestMapping("/")
public class HomepageController {

    private UserService userService;

    public HomepageController(UserService userService) {
        this.userService = userService;
    }

    //checking user roles and personalizing the homepage based on authentication
    @GetMapping("")
    public String homepage(Model model) {
        String LoginUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals("ROLE_ADMIN"))) {
              model.addAttribute("userRole1", "ROLE_ADMIN");
        }
        if (authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals("ROLE_MANAGER"))) {
            model.addAttribute("userRole2", "ROLE_MANAGER");
      }

        String anonymousUser = "anonymousUser";
        if (LoginUserName != anonymousUser) {
            User user = userService.findByEmail(LoginUserName);
            model.addAttribute("username", user.getName());
        }
        return "home";
    }
}