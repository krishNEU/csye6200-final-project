/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class LaboratoryOrganization extends Organization {

    // Constructor for the LaboratoryOrganization class
    public LaboratoryOrganization(String name, OrganizationDirectory parent) {
        // If name is null, assign a default Laboratory value, otherwise use the provided name
        super(name == null ? Organization.Type.Laboratory.getValue() : name, parent, Organization.Type.Laboratory.getValue());
    }

    // Method to get the list of roles supported by this organization
    @Override
    public ArrayList<Role> getSupportedRole() {
        // Initialize the roles list and add LabEmployeeRole
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabEmployeeRole());
        return roles; // Return the list of roles
    }
}
