/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.LogisticsOfficerRole.LogisticsOfficerWorkAreaJPanel;

/**
 *
 * @author siddh
 */
public class LogisticsOfficerRole extends Role {

    // Method to create the work area for the Logistics Officer role
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        // Returning the specific Logistics Officer Work Area Panel
        return new LogisticsOfficerWorkAreaJPanel(account, (LogisticsOrganization) organization, enterprise, business, network);
    }
}
