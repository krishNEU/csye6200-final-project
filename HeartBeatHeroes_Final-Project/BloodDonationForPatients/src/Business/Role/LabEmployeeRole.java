/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.LaboratoryOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.LabEmployeeRole.LabEmployeeWorkAreaJPanel;

/**
 *
 * @author siddh
 */
public class LabEmployeeRole extends Role {

    // Method to create work area for the lab employee
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        // Return new work area panel specific to lab employee
        return new LabEmployeeWorkAreaJPanel(account, (LaboratoryOrganization) organization, enterprise, business, network);
    }
}
