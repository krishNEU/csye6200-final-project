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
public class Donor {
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
    private Date  lastDonationDate;
    private boolean brainInjury;
    private boolean diabitiesBP;       // Currently you do NOT have any diabitiesBP? 
    private boolean breathingProb;
    private String imagePath; 
    private byte[] dP;
    private Date cancerDiagnosedDate;

    // Default constructor
    public Donor(){
    }
    
    // Getter and Setter for imagePath
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Getter and Setter for dP (donor profile image)
    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    // Getter Setter Functions
    public String getName() { return name; }               // Get donor's name
    public void setName(String name) { this.name = name; }  // Set donor's name
    public long getContact() { return contact; }            // Get donor's contact number
    public void setContact(long contact) { this.contact = contact; } // Set donor's contact number
    
    public String getDonorID() { return donorID; }          // Get donor ID
    public void setDonorID(String donorID) { this.donorID = donorID; } // Set donor ID

    public Date getDob() { return dob; }                    // Get date of birth
    public void setDob(Date dob) { this.dob = dob; }        // Set date of birth

    public int getAge() { return age; }                     // Get donor's age
    public void setAge(int age) { this.age = age; }         // Set donor's age

    public String getGender() { return gender; }            // Get donor's gender
    public void setGender(String gender) { this.gender = gender; } // Set donor's gender

    public BloodType getBloodType() { return this.bloodType; } // Get blood type
    public void setHLA(BloodType bloodType) { this.bloodType = bloodType; } // Set blood type

    public String getStreetAddress() { return streetAddress; } // Get street address
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; } // Set street address

    public String getCity() { return city; }                // Get city
    public void setCity(String city) { this.city = city; }  // Set city

    public String getState() { return state; }              // Get state
    public void setState(String state) { this.state = state; } // Set state

    public int getZipCode() { return zipCode; }             // Get zip code
    public void setZipCode(int zipCode) { this.zipCode = zipCode; } // Set zip code

    public String getEmailID() { return emailID; }          // Get email ID
    public void setEmailID(String emailID) { this.emailID = emailID; } // Set email ID

    public String getStatus() { return status; }            // Get donor's status
    public void setStatus(String status) { this.status = status; } // Set donor's status

    public Date getLastDonationDate() { return lastDonationDate; } // Get last donation date
    public void setLastDonationDate(Date lastDonationDate) { this.lastDonationDate = lastDonationDate; } // Set last donation date

    public boolean isBrainInjury() { return brainInjury; }  // Check if donor has brain injury
    public void setBrainInjury(boolean brainInjury) { this.brainInjury = brainInjury; } // Set brain injury status

    public boolean isDiabitiesBP() { return diabitiesBP; }  // Check if donor has diabetes/BP
    public void setDiabitiesBP(boolean diabitiesBP) { this.diabitiesBP = diabitiesBP; } // Set diabetes/BP status

    public boolean isBreathingProb() { return breathingProb; } // Check if donor has breathing problems
    public void setBreathingProb(boolean breathingProb) { this.breathingProb = breathingProb; } // Set breathing problem status

    public void setCancerDiagnosedDate(Date date) { this.cancerDiagnosedDate = date; } // Set cancer diagnosed date
    
    @Override
    public String toString() {
        return donorID; // Return donor ID as string representation
    }
}
