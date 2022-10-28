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
public class CommunityDirectory {
    
    ArrayList<Community> communitylist = new ArrayList<Community>();

    public ArrayList<Community> getPatientlist() {
        return communitylist;
    }

    public void setCommunitylist(ArrayList<Community> communitylist) {
        this.communitylist = communitylist;
    }
    
    
    public Community addNewCommunity(){
        Community comm = new Community();
        communitylist.add(comm);
        return comm; 
    }
    
    public void deleteCommunity(Community h){
    communitylist.remove(h);
    }
    
}
