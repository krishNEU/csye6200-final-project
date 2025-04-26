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
public class HeadquarterEnterprise extends Enterprise {

    // Constructor to initialize the HeadquarterEnterprise with a name
    public HeadquarterEnterprise(String name) {
        super(name, EnterpriseType.Headquarter); // Calls the constructor of the superclass (Enterprise)
        this.addOrganizationType(Type.Headquarter); // Adds the organization type as Headquarter
    }

    // Method to return supported roles (currently not implemented)
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; // Returning null as there are no supported roles defined yet
    }
}
