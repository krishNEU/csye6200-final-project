/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requests;

import Business.BloodTypes.BloodInventory;
import Business.BloodTypes.BloodTransaction;
import Business.BloodTypes.PersonBloodTypes;
import Business.EcoSystem;
import Business.Requests.DonorRequest;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class PatientRequestDirectory {

    EcoSystem system;
    private ArrayList<PatientRequest> patientRequestList;

    // Constructor to initialize the patientRequestList and system
    public PatientRequestDirectory(EcoSystem system) {
        patientRequestList = new ArrayList<PatientRequest>();
        this.system = system;
    }

    // Getter for the patientRequestList
    public ArrayList<PatientRequest> getPatientRequestList() {
        return patientRequestList;
    }

    // Setter for the patientRequestList
    public void setPatientRequestList(ArrayList<PatientRequest> patientRequestList) {
        this.patientRequestList = patientRequestList;
    }

    // Method to add a PatientRequest to the list
    public void addPatientRequest(PatientRequest patientRequest) {
        patientRequestList.add(patientRequest);
    }

    // Method to remove a PatientRequest from the list
    public DonorRequest removePatientRequest(PatientRequest p) {
        patientRequestList.remove(p);
        return null;
    }

    // Getter for the EcoSystem instance
    public EcoSystem getEcoSystem() {
        return system;
    }

    // Method to register a blood request in the inventory
    public void registerBloodRequestForInventory(PersonBloodTypes.BloodType bloodType, PatientRequest request, int volume) {
        BloodInventory inventory = system.getInventory();
        inventory.addTransaction(bloodType, volume, BloodTransaction.TransactionType.Out, request);
    }
}
