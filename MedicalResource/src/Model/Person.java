/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class Person extends House {
    String personName;
    int personAge;
    String personGender;
    
    public Person(){}
    
    
    public Person(String personName, String personGender, int personAge, String houseAddress, String communityName, String cityName)
    {
        this.personName = personName;
        this.personGender = personGender;
        this.personAge = personAge;
        super.houseAddress = houseAddress;
        super.cityName = cityName;
        super.communityName = communityName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }
    
    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }
    
}
