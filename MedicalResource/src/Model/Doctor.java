/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class Doctor extends Person{
    int doctorID;
    private static int count = 0;
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
//    Hashmap <String, String> doc_login_cred_map =new Hashmap();

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    
    public Doctor(){
        this.doctorID = count;
        count++;
    }
    
    public Doctor(String personName, int personAge, String houseAddress, String communityName, String cityName, int doctorID, String username, String password){
        this.doctorID = count;
        super.personName = personName;
        super.personAge = personAge;
        super.houseAddress = houseAddress;
        super.communityName = communityName;
        super.cityName = cityName;
        this.username = username;
        this.password = password;        
        count++;
        
    }
    
    
    
    
//    
    @Override
    public String toString(){
        return (String.valueOf(personName));
    }
    
    
    
    
    
    
}
