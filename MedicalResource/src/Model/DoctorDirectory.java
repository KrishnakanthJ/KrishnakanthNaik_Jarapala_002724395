/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorlist;
    private ArrayList<Doctor> newdoctorlist;
    HashMap<String, String> credentialsMap; 

    
    public DoctorDirectory(){
        this.doctorlist = new ArrayList<Doctor>();
        this.newdoctorlist = new ArrayList<Doctor>();
        this.credentialsMap = new HashMap();
    }
    
    public ArrayList<Doctor> getNewdoctorlist() {
        return newdoctorlist;
    }

    public void setNewdoctorlist(ArrayList<Doctor> newdoctorlist) {
        this.newdoctorlist = newdoctorlist;
    }
    
    public ArrayList<Doctor> getDoctorlist() {
        return doctorlist;
    }

    public void setDoctorlist(ArrayList<Doctor> doctorlist) {
        this.doctorlist = doctorlist;
    }
    
    public Doctor addNewEmployee(){
        Doctor newEmployee = new Doctor();
        doctorlist.add(newEmployee);
        return newEmployee;
        
    }

    public void deleteProfile(Doctor ei) {
            doctorlist.remove(ei);


    }
     
//    Method to search doctor by id
    public void SearchDoctorIdList(int doctorId) 
    {
        for(Doctor doctor : doctorlist)
        {
           if(doctorId == doctor.getDoctorID())
           {               
               newdoctorlist.add(doctor);
           }
        }
    }
    
    
    public void ClearTable() 
    {
        doctorlist.clear();
    }
    
    public HashMap<String, String> fetchPatientCredantials(){
        
        for (Doctor doctor : doctorlist) 
        {
            credentialsMap.put(doctor.getUsername(), doctor.getPassword());
        }
        return credentialsMap;
    }
    
    public boolean isUserNameExist(String username){
        for (Doctor doctor : doctorlist) 
        {
            if(doctor.getUsername() == username || doctor.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    
    
}
