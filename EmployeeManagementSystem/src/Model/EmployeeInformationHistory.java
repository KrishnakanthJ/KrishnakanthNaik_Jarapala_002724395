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
public class EmployeeInformationHistory {
    private ArrayList<EmployeeInformation> history;
    
//    As this is the object we need to define it, so here we use constructor to define the EmployeeInformationHistory.
    
    public EmployeeInformationHistory(){
        this.history = new ArrayList<EmployeeInformation>(); 
    }

    public ArrayList<EmployeeInformation> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeInformation> history) {
        this.history = history;
    }
    
    public EmployeeInformation addNewEmployee(){
        EmployeeInformation newEmployee = new EmployeeInformation();
        history.add(newEmployee);
        return newEmployee;
        
    }
}
