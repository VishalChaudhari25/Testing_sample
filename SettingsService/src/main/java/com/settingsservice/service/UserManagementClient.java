package com.settingsservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-management-service", url = "http://localhost:8081/api/user-management")
public interface UserManagementClient {
    @GetMapping("/roles")
    String getUserRoles();
}

