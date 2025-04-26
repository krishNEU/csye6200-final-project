/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Date;

/**
 *
 * @author User
 */
public class Employee {
    private String name;
    private int id;
    private int contactNumber;
    private Date dateOfBirth;
    private String gender;
    private String city;
    private String state;
    private String specialization;
    private String address;

    private static int count = 1;

    // Constructor initializes employee with an ID
    public Employee() {
        id = count;
        count++;
    }

    // Getter method for ID
    public int getId() {
        return id;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for contact number
    public int getContactNumber() {
        return contactNumber;
    }

    // Setter method for contact number
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getter method for date of birth
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter method for date of birth
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Getter method for gender
    public String getGender() {
        return gender;
    }

    // Setter method for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter method for city
    public String getCity() {
        return city;
    }

    // Setter method for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter method for state
    public String getState() {
        return state;
    }

    // Setter method for state
    public void setState(String state) {
        this.state = state;
    }

    // Getter method for specialization
    public String getSpecialization() {
        return specialization;
    }

    // Setter method for specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Override toString method to return employee's name
    @Override
    public String toString() {
        return name;
    }
}
