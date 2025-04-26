/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LogisticsOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class LogisticsOrganization extends Organization {
    
    // Constructor to initialize the LogisticsOrganization with a name and parent directory
    public LogisticsOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Logistics.getValue() : name, parent, Organization.Type.Logistics.getValue());
    }
    
    // Method to get the supported roles for the LogisticsOrganization
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LogisticsOfficerRole()); // Add LogisticsOfficerRole to the list of supported roles
        return roles;
    }
}

