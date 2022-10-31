/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class PatientDirectory {
    private ArrayList<Patient> patientlist;
    private ArrayList<Patient> newpatientlist;
    HashMap<String, String> credentialsMap; 
    Set<String> unique_communities = new HashSet<String>();

    public PatientDirectory(){
        this.patientlist = new ArrayList<Patient>();
        this.newpatientlist = new ArrayList<Patient>();
        this.credentialsMap = new HashMap();
    }
    
    public Patient addNewEmployee(){
        Patient newEmployee = new Patient();
        patientlist.add(newEmployee);
        return newEmployee;    
    }

    public void deleteProfile(Patient ei) {
        patientlist.remove(ei);
    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }

    public ArrayList<Patient> getNewpatientlist() {
        return newpatientlist;
    }

    public void setNewpatientlist(ArrayList<Patient> newpatientlist) {
        this.newpatientlist = newpatientlist;
    }
    
    
    public Patient searchPatient(int patientid) 
    {
        for (Patient encounterPatient : patientlist) 
        {
            if (encounterPatient.getPatientID() == patientid) 
            {
                return encounterPatient;
            }
        }
        return null;
    }
    
    public void ClearTable() 
    {
        newpatientlist.clear();
    }
    
    public HashMap<String, String> fetchPatientCredantials(){
        
        for (Patient patient : patientlist) 
        {
            credentialsMap.put(patient.getUsername(), patient.getPassword());
        }
        return credentialsMap;
    }
    
    public boolean isUserNameExist(String username){
        for (Patient patient : patientlist) 
        {
            if(patient.getUsername() == username || patient.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    
    public Set fetchUniqueCommunities(){

        for(Patient patient: patientlist){
//                unique_communities.add(patient.getCommunityName());
        }
        return unique_communities;
    }
                                                                                                                                                                                                                                                                    
}
