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
public class City {

    String cityName;
    ArrayList<Community> communitylist;
    
    public City() {
        this.communitylist = new ArrayList<Community>();
    }
    
    public String getCityName() {
        return cityName;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
    
    public ArrayList<Community> getCommunitylist() {
        return communitylist;
    }

    public void setCommunitylist(ArrayList<Community> communitylist) {
        this.communitylist = communitylist;
    }
    
    public void addNewCommunity(String communityName){
        Community newCommunity = new Community();
        newCommunity.setCommunityName(communityName);
        communitylist.add(newCommunity);
    }
    
    public String toString(){
        return cityName;
    }
    
    
//    public void addNewCommunity(String communityName){
//        if(! communitylist.isEmpty()){
//            for(Community comm: communitylist){
//                if(!(comm.getCommunityName().equals(communityName))){
//                    Community newCommunity = new Community();
//                    newCommunity.setCommunityName(communityName);
//                    communitylist.add(newCommunity);
//                }
//            }
//        }
//        else{
//            Community newCommunity = new Community();
//            newCommunity.setCommunityName(communityName);
//            communitylist.add(newCommunity);
//        }
//    }
    
    public Community searchCommunity(String communityName){
        for(Community comm: communitylist){
            if(comm.getCommunityName().equals(communityName)){
                return comm;
            }
        }
        return null;
    }
    
    public boolean isCommunityExist(String communityName){
        for(Community comm: communitylist){
            if(comm.getCommunityName().equals(communityName)){
                return true;
            }
        }
        return false;
    }
    
}
