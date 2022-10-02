/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jkkn7
 */
//Please check and change history = emplist //renamed as emplist 
public class EmployeeInformationHistory {
    private ArrayList<EmployeeInformation> emplist;
    
//    As this is the object we need to define it, so here we use constructor to define the EmployeeInformationHistory.
    //1. Constructor
    public EmployeeInformationHistory(){
        this.emplist = new ArrayList<EmployeeInformation>(); 
    }
    //2. Getter for above constructor
    public ArrayList<EmployeeInformation> getHistory() {
        return emplist;
    }
    //2. Setter for above constructor
    public void setHistory(ArrayList<EmployeeInformation> history) {
        this.emplist = emplist;
    }
    
    //Method to add new employees to the list
    public EmployeeInformation addNewEmployee(){
        EmployeeInformation newEmployee = new EmployeeInformation();
        emplist.add(newEmployee);
        return newEmployee;
        
    }
}
