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
public class LaboratoryEnterprise extends Enterprise {

    // Constructor to initialize the LaboratoryEnterprise with the given name
    public LaboratoryEnterprise(String name) {
        super(name, EnterpriseType.Laboratory); // Call to superclass constructor
        this.addOrganizationType(Type.Laboratory); // Adding organization type
    }

    // Method to return the list of supported roles (currently returns null)
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
