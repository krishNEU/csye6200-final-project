/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class GovernmentOrganization extends Organization {

    public GovernmentOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Government.getValue() : name, parent, Organization.Type.Government.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAgentRole()); // Adding a GovernmentAgentRole to the list
        return roles;
    }

}
