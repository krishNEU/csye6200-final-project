/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author siddh
 */
public abstract class Role {

    // Enum to define different roles in the system
    public enum RoleType {
        Admin("Admin"),
        CaseManager("Case Manager"),
        GovernmentAgent("Government Agent"),
        LabEmployee("Lab Employee"),
        LocalClinic("Local Clinic Staff"),
        LogisticsOfficer("Logistics Officer");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        // Getter for role value
        public String getValue() {
            return value;
        }

        // Override toString to return the role name
        @Override
        public String toString() {
            return value;
        }
    }

    // Abstract method to create a work area
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    // Override toString method to return the role class name
    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
