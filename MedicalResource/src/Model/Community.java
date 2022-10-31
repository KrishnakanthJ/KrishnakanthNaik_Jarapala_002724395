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
public class Community{
    
    String communityName;
    ArrayList<House> houselist;
    ArrayList<Hospital> hospitallist;


    public Community() {
        this.houselist = new ArrayList<House>();
        this.hospitallist = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitallist() {
        return hospitallist;
    }

    public void setHospitallist(ArrayList<Hospital> hospitallist) {
        this.hospitallist = hospitallist;
    }
    
    public ArrayList<House> getHouselist() {
        return houselist;
    }

    public void setHouselist(ArrayList<House> houselist) {
        this.houselist = houselist;
    }
       
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String CommunityName) {
        this.communityName = CommunityName;
    }
    
    public void addNewHouse(String ha){
        House newHA = new House();
        newHA.setHouseAddress(ha);
        houselist.add(newHA);
    }
    
    
    public boolean isHouseExist(String ha){
        for(House hadd: houselist){
            if(hadd.getHouseAddress().equals(ha)){
                return true;
            }
        }
        return false;
    }
    
    public void deleteHouse(House h){
        houselist.remove(h);
    }
    
    
    
    public void addNewHospital(String hname, int hid){
        Hospital newHA = new Hospital();
        newHA.setHospitalName(hname);
        newHA.setHospitalId(hid);
        hospitallist.add(newHA);
    }
    
    
    public boolean isHospitalIdExist(int hid)
    {
        for(Hospital hadd: hospitallist){
            int flag = hadd.getHospitalId();
            if(flag == hid){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    
    public Hospital searchHospitalId(int hid)
    {
        for(Hospital hadd: hospitallist){
            int flag = hadd.getHospitalId();
            if(flag == hid){
                return hadd;
            }
            else{
                return null;
            }
        }
        return null;
    }
    
    public void deleteHospital(Hospital h){
        hospitallist.remove(h);
    }
 
}
