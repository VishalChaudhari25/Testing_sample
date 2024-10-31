package com.settingsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.settingsservice.service.SettingsService;

@RestController
@RequestMapping("/api/settings")
public class SettingsController {
    @Autowired
    private SettingsService settingsService;

    @GetMapping("/company-details")
    public String getCompanyDetails() {
        return settingsService.getCompanyDetails();
    }

    @GetMapping("/user-roles")
    public String getUserRoles() {
        return settingsService.getUserRoles();
    }
}

