package com.settingsservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "general-setup-service", url = "http://localhost:8080/api/general-setup")
public interface GeneralSetupClient {
    @GetMapping("/company")
    String getCompanyDetails();
}
