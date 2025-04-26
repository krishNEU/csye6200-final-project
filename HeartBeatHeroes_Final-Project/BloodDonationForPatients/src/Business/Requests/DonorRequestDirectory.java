/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requests;

import Business.BloodTypes.BloodInventory;
import Business.BloodTypes.BloodTransaction;
import Business.BloodTypes.PersonBloodTypes;
import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class DonorRequestDirectory {
    EcoSystem system;
    private ArrayList<DonorRequest> donorRequestList;

    // Constructor to initialize the system and donorRequestList
    public DonorRequestDirectory(EcoSystem system){
        this.system = system;
        donorRequestList = new ArrayList<DonorRequest>();
    }
    
    // Getter for donorRequestList
    public ArrayList<DonorRequest> getDonorRequestList() {
        return donorRequestList;
    }
    
    // Setter for donorRequestList
    public void setDonorRequestList(ArrayList<DonorRequest> donorRequestList) {
        this.donorRequestList = donorRequestList;
    }

    // Method to add a new DonorRequest to the list
    public DonorRequest addDonorRequest(DonorRequest donorRequest)
    {
        donorRequestList.add(donorRequest);
        return donorRequest;
    }

    // Method to remove a DonorRequest from the list
    public DonorRequest removeDonorRequest(DonorRequest donorReq)
    {
        donorRequestList.remove(donorReq);
        return null;
    }
    
    // Method to get the EcoSystem associated with this directory
    public EcoSystem getEcoSystem(){
        return system;
    }
    
    // Register a donor application for blood inventory transaction
    public void registerDonorApplicationForInventory(PersonBloodTypes.BloodType bloodType, DonorRequest request) {
        BloodInventory inventory = system.getInventory();
        inventory.addTransaction(bloodType, 1, BloodTransaction.TransactionType.In, request);
    }
}
