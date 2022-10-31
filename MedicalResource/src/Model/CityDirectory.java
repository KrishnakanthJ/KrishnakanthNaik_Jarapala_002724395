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
public class CityDirectory {
    
    ArrayList<City> citylist ;
    public CityDirectory(){
        this.citylist = new ArrayList<City>();

    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
    
    
    public void addNewCity(String cityName){
        City newCity = new City();
        newCity.setCityName(cityName);
        citylist.add(newCity);
//        return newCity;
        
    } 
      
    
    
    public City searchCity(String cityName){
        for(City city: citylist){
            if(city.getCityName().equals(cityName)){
                return city;
            }
        }
        return null;
    }
    
    public boolean isCityExist(String cityName){
        for(City city: citylist){
            if(city.getCityName().equals(cityName)){
                return true;
            }
        }
        return false;
    }

    
}
