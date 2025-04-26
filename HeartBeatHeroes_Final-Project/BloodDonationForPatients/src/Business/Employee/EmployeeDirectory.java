/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    // Constructor to initialize the employee list
    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    // Method to get the list of employees
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    // Method to create a new employee and add them to the list
    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}
