/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BloodTypes.PersonBloodTypes;
import Business.DB4OUtil.DB4OUtil;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public abstract class Organization {

    // Declare instance variables for organization details
    private OrganizationDirectory directory;
    private int organizationID;
    private String name;
    private String realName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private static int counter = 0;
    private ArrayList<PersonBloodTypes> allHLAs;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    // Enum to define different types of organizations
    public enum Type {
        Admin("Admin Organization"),
        Government("Government Agency Organization"),
        Headquarter("HQ Organization"),
        Laboratory("Laboratory Organization"),
        Logistics("Logistics Organization"),
        LocalClinic("Local Clinic Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    // Constructor to initialize the organization with name and directory
    public Organization(String name, OrganizationDirectory directory, String type) {
        this.realName = name;
        this.name = type;
        this.directory = directory;
        workQueue = new WorkQueue();  // Initialize work queue
        System.out.println("initialise work queue");
        employeeDirectory = new EmployeeDirectory();  // Initialize employee directory
        userAccountDirectory = new UserAccountDirectory();  // Initialize user account directory
        organizationID = counter;  // Set organization ID
        ++counter;  // Increment counter for next organization ID
    }

    // Abstract method to get supported roles (to be implemented in subclasses)
    public abstract ArrayList<Role> getSupportedRole();

    // Getter methods
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    // Override toString to return the organization's name
    @Override
    public String toString() {
        return name;
    }
}
