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
public class LogisticsEnterprise extends Enterprise {

    // Constructor to initialize the LogisticsEnterprise with a name
    public LogisticsEnterprise(String name) {
        super(name, EnterpriseType.Logistics);
        this.addOrganizationType(Type.Logistics);
    }

    // Method to get supported roles (currently returns null)
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
