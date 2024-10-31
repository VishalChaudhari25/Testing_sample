package com.generalsetupservice.service;

import org.springframework.stereotype.Service;

@Service
public class GeneralSetupService {
    public String getCompanyDetails() {
        return "Company Details: Name - ExampleCorp, Location - CityCenter";
    }
}
