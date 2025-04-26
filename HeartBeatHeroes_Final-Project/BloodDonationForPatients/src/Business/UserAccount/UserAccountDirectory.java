/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();  // Initializes the userAccountList
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;  // Returns the list of user accounts
    }

    public boolean checkIfUsernameIsUnique(String username) {
        // Checks if the given username is unique in the list
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public UserAccount authenticateUser(String username, String password) {
        // Authenticates the user by matching username and password
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;  // Returns null if no matching user is found
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        // Creates a new user account and adds it to the list
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
}
