package com.usermanagementservice.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserRoles() {
        return "User Roles: Admin, Manager, Employee";
    }
}

