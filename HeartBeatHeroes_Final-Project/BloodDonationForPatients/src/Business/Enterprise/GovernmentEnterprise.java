/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GovernmentEnterprise extends Enterprise {

    // Constructor to initialize the GovernmentEnterprise with name and organization
    // type
    public GovernmentEnterprise(String name) {
        super(name, EnterpriseType.Government);
        this.addOrganizationType(Type.Government);
    }

    // Override the getSupportedRole method to return supported roles (currently
    // null)
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
