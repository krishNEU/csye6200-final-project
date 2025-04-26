/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BloodTypes.BloodCount;
import Business.Role.LocalClinicStaffRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author krish19
 */
public class LocalClinicOrganization extends Organization {

    BloodCount inventory;

    // Constructor to initialize LocalClinicOrganization with a name and parent OrganizationDirectory
    public LocalClinicOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.LocalClinic.getValue() : name, parent, Organization.Type.LocalClinic.getValue());
        inventory = new BloodCount();
    }

    // Getter method to retrieve the BloodCount inventory
    public BloodCount getInventory() {
        return inventory;
    }

    // Setter method to update the BloodCount inventory
    public void setInventory(BloodCount inventory) {
        this.inventory = inventory;
    }

    // Method to retrieve a HashMap of BloodType combo counts from inventory
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getBloodTypeComboCounts();
    }

    // Overridden method to return supported roles for LocalClinicOrganization
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LocalClinicStaffRole());
        return roles;
    }
}
