/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author User
 */
public class Network {

    private String name;
    private String state;
    private String country;
    private EnterpriseDirectory enterpriseDirectory;

    // Constructor initializing enterpriseDirectory
    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for enterpriseDirectory
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    // Getter method for state
    public String getState() {
        return state;
    }

    // Setter method for state
    public void setState(String state) {
        this.state = state;
    }

    // Getter method for country
    public String getCountry() {
        return country;
    }

    // Setter method for country
    public void setCountry(String country) {
        this.country = country;
    }

    // Overridden toString method to return name
    @Override
    public String toString() {
        return name;
    }

}
