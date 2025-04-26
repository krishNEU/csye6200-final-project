/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author krish19
 */
public class UserAccount {
     private String username;
     private String password;
     private Employee employee;
     private Role role;
     private WorkQueue workQueue;
     private String name;
    
    // Constructor initializes workQueue
    public UserAccount() {
        workQueue = new WorkQueue();
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for employee
    public Employee getEmployee() {
        return employee;
    }

    // Setter for employee
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Getter for role
    public Role getRole() {
        return role;
    }

    // Setter for role
    public void setRole(Role role) {
        this.role = role;
    }

    // Getter for workQueue
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Override toString method to return username
    @Override
    public String toString() {
        return username;
    }
}
