/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    // Constructor to initialize workRequestList
    public WorkQueue() {
        workRequestList = new ArrayList<WorkRequest>();
    }

    // Getter method to return the workRequestList
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
