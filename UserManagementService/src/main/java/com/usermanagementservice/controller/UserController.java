package com.usermanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagementservice.service.UserService;

@RestController
@RequestMapping("/api/user-management")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/roles")
    public String getUserRoles() {
        return userService.getUserRoles();
    }
}
