/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.LocalClinicOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.LocalClinicStaffRole.LocalClinicWorkAreaJPanel;

/**
 *
 * @author siddh
 */
public class LocalClinicStaffRole extends Role {
    
    // Method to create work area for local clinic staff
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        // Return the work area panel for local clinic staff
        return new LocalClinicWorkAreaJPanel(account, (LocalClinicOrganization)organization, enterprise, business, network);
    }
}

