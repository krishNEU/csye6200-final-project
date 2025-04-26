/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requests;

import Business.BloodTypes.PersonBloodTypes;
import Business.BloodTypes.PersonBloodTypes.BloodType;
import Business.Statuses.BloodRequestStatuses;
import Business.Statuses.DonorApplicationStatuses;
import java.util.Date;

/**
 *
 * @author krish19
 */
public class PatientRequest {

    PatientRequestDirectory directory;

    private String receiverID;
    private String name;
    private Date dob;
    private Date cancerDiagnosedDate;
    private int age;
    private String gender;
    private BloodType bloodType;
    private int volume;

    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private long contact;
    private String emailID;
    private boolean labConfirmation;
    private String status;
    private String imagePath;
    private byte[] dP;

    // Constructor to initialize the directory
    public PatientRequest(PatientRequestDirectory directory) {
        this.directory = directory;
    }

    // Getter and Setter methods for profile picture
    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    // Getter and Setter methods for image path
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Getter and Setter methods for patient details
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

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
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

    // Getter and Setter methods for address details
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

    // Method to set and get the cancer diagnosis date
    public void setCancerDiagnosedDate(Date date) {
        this.cancerDiagnosedDate = date;
    }

    public Date getCancerDiagnosedDate() {
        return this.cancerDiagnosedDate;
    }

    // Setter and Getter for BloodType and Volume
    public BloodType getBloodType() {
        return bloodType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    // Getter and Setter for lab confirmation status
    public boolean isLabConfirmation() {
        return labConfirmation;
    }

    public void setLabConfirmation(boolean labConfirmation) {
        this.labConfirmation = labConfirmation;
    }

    // Status setter with logic to handle inventory requests
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if ((volume != 0) && (BloodRequestStatuses.RequestStatus.LeftInventory.getValue().equals(status))) {
            this.directory.registerBloodRequestForInventory(bloodType, this, volume);
        }
        this.status = status;
    }

    // Overridden toString method to return receiver ID
    @Override
    public String toString() {
        return receiverID;
    }
}

