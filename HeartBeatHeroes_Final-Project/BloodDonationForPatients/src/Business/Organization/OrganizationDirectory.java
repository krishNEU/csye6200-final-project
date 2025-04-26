/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    // Constructor initializes the organization list
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    // Returns the list of organizations
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    // Creates and adds a new organization based on its type
    public Organization createOrganization(Organization.Type type, String realName){
        Organization organization = null;
        
        // Create organization based on type
        if (type.getValue().equals(Organization.Type.Government.getValue())){
            organization = new GovernmentOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.Headquarter.getValue())){
            organization = new HeadquarterOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.Laboratory.getValue())){
            organization = new LaboratoryOrganization(realName, this);
            System.out.println(this);
        } else if (type.getValue().equals(Organization.Type.LocalClinic.getValue())){
            organization = new LocalClinicOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.Logistics.getValue())){
            organization = new LogisticsOrganization(realName, this);
        }

        // Add the newly created organization to the list
        organizationList.add(organization);
        return organization;
    }
}

