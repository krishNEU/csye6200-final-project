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
public class BloodRequestStatuses {

    // Enum for various request statuses with their corresponding string values
    public enum RequestStatus {
        Submitted("Submitted"),
        Pending("Pending"),
        Closed("Closed"),
        Funded("Approved for Funding"),
        Declined("Declined"),
        LeftInventory("Left Inventory"),
        Shipped("Shipped"),
        Delivered("Delivered"),
        Tested("Tested"),
        Administered("Administered"),
        Finalized("Finalized");

        private String value;

        // Constructor for setting the value of each status
        private RequestStatus(String value) {
            this.value = value;
        }

        // Getter for the status value
        public String getValue() {
            return value;
        }

        // Override toString() method to return the value
        @Override
        public String toString() {
            return value;
        }
    }

    // List to store all the request statuses
    ArrayList<RequestStatus> statusList;

    // Constructor to initialize the status list with all enum values
    public BloodRequestStatuses() {
        statusList = new ArrayList<RequestStatus>(Arrays.asList(RequestStatus.values()));
    }

    // Method to find and return a status based on its string value
    public RequestStatus findRequestStatus(String status) {
        for (RequestStatus rs : statusList) {
            if (rs.getValue().equals(status)) return rs;
        }
        return null;
    }

    // Method to get the list of all request statuses
    public ArrayList<RequestStatus> getBloodRequestStatusList() {
        return statusList;
    }
}
