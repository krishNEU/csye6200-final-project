/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CaseManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class HeadquarterOrganization extends Organization {

    // Constructor for HeadquarterOrganization, initializes with the given name or default to "Headquarter"
    public HeadquarterOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Headquarter.getValue() : name, parent, Organization.Type.Headquarter.getValue());
    }

    // Returns the list of roles supported by the HeadquarterOrganization
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaseManagerRole()); // Adds CaseManagerRole to the list of roles
        return roles;
    }
}

