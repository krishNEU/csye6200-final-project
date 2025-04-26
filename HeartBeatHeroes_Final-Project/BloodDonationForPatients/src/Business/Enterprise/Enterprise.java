/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private long contact;
    private String email;
    private String zipcode;

    public ArrayList<Organization.Type> supportedOrgTypes;

    // Constructor to initialize enterprise with name and type
    public Enterprise(String name, EnterpriseType type) {
        super(name, null, type.getValue());
        this.enterpriseType = type;
        this.supportedOrgTypes = new ArrayList<Organization.Type>();
        organizationDirectory = new OrganizationDirectory();
    }

    // Getter for Enterprise Type
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    // Setter for Enterprise Type
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    // Getter for Organization Directory
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    // Method to add supported organization type
    public void addOrganizationType(Organization.Type organizationType) {
        supportedOrgTypes.add(organizationType);
    }

    // Method to get supported organization types
    public ArrayList<Organization.Type> getSupportedOrganizationTypes() {
        return supportedOrgTypes;
    }

    // Getter and Setter methods for contact, email, and zipcode
    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // Enum for different types of enterprises
    public enum EnterpriseType {
        Laboratory("Laboratory"),
        LocalClinic("LocalClinic"),
        Logistics("Logistics"),
        Headquarter("Headquarter"),
        Government("Government");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
