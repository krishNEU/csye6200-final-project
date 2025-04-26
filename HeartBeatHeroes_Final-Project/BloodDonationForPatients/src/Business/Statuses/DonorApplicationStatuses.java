/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Statuses;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author krish19
 */
public class DonorApplicationStatuses {
    
    // Enum representing different request statuses
    public enum RequestStatus {
        Submitted("Submitted"),
        Pending("Pending"),
        AddedToInventory("Added to inventory"),
        Closed("Closed"),
        Declined("Declined"),
        Finalized("Finalized");
        
        private String value;

        // Constructor to set the value for each status
        private RequestStatus(String value) {
            this.value = value;
        }

        // Getter method to retrieve the status value
        public String getValue() {
            return value;
        }

        // Override toString() to return the status value
        @Override
        public String toString() {
            return value;
        }
    }
    
    ArrayList<RequestStatus> statusList;
    
    // Constructor initializes the list of statuses
    public DonorApplicationStatuses(){
        statusList = new ArrayList<RequestStatus>(Arrays.asList(RequestStatus.values()));
    }
    
    // Method to find a status by its string value
    public RequestStatus findDonorApplicationStatus(String status){
        for (RequestStatus rs : statusList){
            if (rs.getValue().equals(status)) return rs;
        }
        return null;
    }
    
    // Method to get the list of all request statuses
    public ArrayList<RequestStatus> getDonorApplicationStatusList(){
        return statusList;
    }
}
