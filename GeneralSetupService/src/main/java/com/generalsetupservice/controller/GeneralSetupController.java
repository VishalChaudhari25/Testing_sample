package com.generalsetupservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generalsetupservice.service.GeneralSetupService;

@RestController
@RequestMapping("/api/general-setup")
public class GeneralSetupController {
    @Autowired
    private GeneralSetupService generalSetupService;

    @GetMapping("/company")
    public String getCompany() {
        return generalSetupService.getCompanyDetails();
    }
}

