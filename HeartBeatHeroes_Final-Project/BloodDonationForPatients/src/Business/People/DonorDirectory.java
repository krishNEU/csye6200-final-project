/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class DonorDirectory {
     private ArrayList<Donor> donorList;

    // Constructor to initialize the donor list
    public DonorDirectory(){
        donorList = new ArrayList<Donor>();
    }

    // Getter method for donor list
    public ArrayList<Donor> getDonorList() {return donorList;}
    
    // Setter method for donor list
    public void setDonorList(ArrayList<Donor> donorList) {this.donorList = donorList;}

    // Method to add a donor to the list
    public Donor addDonor(Donor donor)
    {
        donorList.add(donor);
        return donor;
    }
}

