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
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;
    private ArrayList<Encounter> personencounterHistory;

    
    public EncounterHistory()
    {
        this.encounterHistory = new ArrayList<Encounter>();
        this.personencounterHistory = new ArrayList<Encounter>();

    }
    
    public Encounter AddNewEncounter()
    {
        Encounter encounter = new Encounter();
        encounterHistory.add(encounter);
        return encounter;
    }
    
    public ArrayList<Encounter> searchPatient(int patientID) 
    {
        for (Encounter encounterPerson : encounterHistory) 
        {   
            personencounterHistory.clear();
            if (encounterPerson.getPatientID() == patientID) 
            {
                personencounterHistory.add(encounterPerson);
            }
        }
        return personencounterHistory;
    }


    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    
}
