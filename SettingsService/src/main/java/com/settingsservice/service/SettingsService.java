package com.settingsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {
    @Autowired
    private GeneralSetupClient generalSetupClient;
    
    @Autowired
    private UserManagementClient userManagementClient;

    public String getCompanyDetails() {
        return generalSetupClient.getCompanyDetails();
    }

    public String getUserRoles() {
        return userManagementClient.getUserRoles();
    }
}
