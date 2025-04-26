/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requests;

import Business.BloodTypes.PersonBloodTypes;
import Business.BloodTypes.PersonBloodTypes.BloodType;
import Business.Statuses.DonorApplicationStatuses;
import java.util.Date;

/**
 *
 * @author krish19
 */
public class DonorRequest {
    private DonorRequestDirectory directory;

    // Donor Attributes
    private String donorID;
    private String name;
    private Date dob;
    private int age;
    private String gender;
    private BloodType bloodType;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private long contact;
    private String emailID;
    private String status;
    private Date lastDonationDate;
    private boolean chronicConditions;
    private boolean currentlyUnwell;
    private boolean selfDrugUse;
    private boolean contagiousDiseases;
    private String imagePath;
    private byte[] dP;
    private int numberOfUnits;

    // Constructor to initialize DonorRequest with directory
    public DonorRequest(DonorRequestDirectory directory) {
        this.directory = directory;
    }

    // Getter and Setter for Image Path and Display Picture (dP)
    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Getter and Setter for Donor's ID
    public String getDonorID() {
        return donorID;
    }

    public void setDonorID(String donorID) {
        this.donorID = donorID;
    }

    // Getter and Setter for Donor's personal information
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    // Getter and Setter for Donor's Address
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getStatus() {
        return status;
    }

    // Set Status and perform specific action if status is 'AddedToInventory'
    public void setStatus(String status) {
        if (DonorApplicationStatuses.RequestStatus.AddedToInventory.getValue().equals(status)) {
            this.directory.registerDonorApplicationForInventory(bloodType, this);
        }
        this.status = status;
    }

    // Getter and Setter for Last Donation Date
    public Date getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(Date lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }

    // Health-related attributes (Chronic Conditions, Well-being, etc.)
    public boolean isChronicConditions() {
        return chronicConditions;
    }

    public void setChronicConditions(boolean chronicConditions) {
        this.chronicConditions = chronicConditions;
    }

    public boolean isCurrentlyUnwell() {
        return currentlyUnwell;
    }

    public void setCurrentlyUnwell(boolean currentlyUnwell) {
        this.currentlyUnwell = currentlyUnwell;
    }

    public boolean isSelfDrugUse() {
        return selfDrugUse;
    }

    public void setSelfDrugUse(boolean selfDrugUse) {
        this.selfDrugUse = selfDrugUse;
    }

    // Getter and Setter for Contagious Diseases
    public boolean isContagiousDiseases() {
        return contagiousDiseases;
    }

    public void setContagiousDiseases(boolean contagiousDiseases) {
        this.contagiousDiseases = contagiousDiseases;
    }

    // toString method to return donor ID as string representation
    @Override
    public String toString() {
        return donorID;
    }
}
