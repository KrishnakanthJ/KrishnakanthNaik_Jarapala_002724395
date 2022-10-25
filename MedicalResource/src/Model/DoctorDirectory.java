/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorlist;
    private ArrayList<Doctor> newdoctorlist;

    public ArrayList<Doctor> getNewdoctorlist() {
        return newdoctorlist;
    }

    public void setNewdoctorlist(ArrayList<Doctor> newdoctorlist) {
        this.newdoctorlist = newdoctorlist;
    }
    
    public DoctorDirectory(){
        this.doctorlist = new ArrayList<Doctor>();
        this.newdoctorlist = new ArrayList<Doctor>();
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
    
    
//    public void SearchPersonIDList(int personId) 
//    {
//        for(Person personInfo : personDirectory)
//        {
//           if(personId == personInfo.getPerson_id())
//           {
//               NewpersonDirectory.add(personInfo);
//           }
//        }
//    }
    
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
//        return tempdoctorlist;

    }
    
    
    public void ClearTable() 
    {
        doctorlist.clear();
    }
    
    
}
