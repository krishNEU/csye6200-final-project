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
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    // Constructor to initialize the patient list
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }

    // Method to retrieve the list of patients
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    // Method to set the list of patients
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    // Method to add a new patient to the list
    public Patient addPatient(Patient patient)
    {
        patientList.add(patient);
        return patient;
    }
}

