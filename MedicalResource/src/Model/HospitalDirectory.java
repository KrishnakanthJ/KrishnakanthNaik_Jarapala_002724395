/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class HospitalDirectory {
        private ArrayList<Hospital> hospitalHistory; // declaration
        
        public HospitalDirectory(){
        this.hospitalHistory = new ArrayList<Hospital>();
    }
        

    public ArrayList<Hospital> getHospitalHistory() {
        return hospitalHistory;
    }
    

    public void setHospitalHistory(ArrayList<Hospital> hospitalHistory) {
        this.hospitalHistory = hospitalHistory;
    }
    
        
    public Hospital addNewHospital(){
        Hospital h = new Hospital();
        hospitalHistory.add(h);
        return h; // returns
    }
    public void deleteHospital(Hospital h){
    hospitalHistory.remove(h);
}

}
