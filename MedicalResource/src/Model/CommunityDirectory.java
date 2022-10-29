/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class CommunityDirectory {
    
    ArrayList<Community> communitylist = new ArrayList<Community>();
    Set<String> unique_communities = new HashSet<String>();


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
    
    
    public Set fetchUniqueCommunities(){

        for(Community comm: communitylist){
            unique_communities.add(comm.getCommunityName());
        }
        return unique_communities;
    }
    
}
