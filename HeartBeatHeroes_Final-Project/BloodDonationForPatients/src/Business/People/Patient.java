/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.People;

import Business.BloodTypes.PersonBloodTypes;
import Business.BloodTypes.PersonBloodTypes.BloodType;
import java.util.Date;

/**
 *
 * @author siddh
 */
public class Patient {
    private String receiverID;
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
    private boolean labConfirmation;
    private boolean legalApproval;
    private boolean emergencyStatus;
    private Date treatmentDate; // Date of Cancer treatment done 
    private String imagePath;
    private byte[] dP;

    public Patient() {
    }

    // Getter Setter Functions for image and profile picture
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

    // Getter Setter Functions for basic patient information
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

    // Getter Setter Functions for address and personal info
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
        return this.bloodType;    
    }
    public void setBloodType(BloodType bloodType) {        
        this.bloodType = bloodType;    
    }

    // Getter Setter Functions for address details
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
    public void setStatus(String status) {        
        this.status = status;    
    }

    // Getter Setter Functions for patient approval statuses
    public boolean isLabConfirmation() {        
        return labConfirmation;    
    }
    public void setLabConfirmation(boolean labConfirmation) {        
        this.labConfirmation = labConfirmation;    
    }

    public boolean isLegalApproval() {        
        return legalApproval;    
    }
    public void setLegalApproval(boolean legalApproval) {        
        this.legalApproval = legalApproval;    
    }

    public boolean isEmergencyStatus() {        
        return emergencyStatus;    
    }
    public void setEmergencyStatus(boolean emergencyStatus) {        
        this.emergencyStatus = emergencyStatus;    
    }

    public Date getTreatmentDate() {        
        return treatmentDate;    
    }
    public void setTreatmentDate(Date treatmentDate) {       
        this.treatmentDate = treatmentDate;    
    }
    
    // Override toString method for patient ID
    @Override
    public String toString() {
        return receiverID;
    }
}

