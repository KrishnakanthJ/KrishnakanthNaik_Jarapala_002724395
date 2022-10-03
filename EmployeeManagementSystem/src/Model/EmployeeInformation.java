/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Krishna Kanth J
 */
public class EmployeeInformation {
    private String employeeId;
    private String employeeName;
    private int employeeAge;
    private String employeeGender;
    private long employeePhnNumber;
    private String employeeEmail;
    private Date employeeStartDate;
    private String employeeLevel;
    private String employeeTeamInfo;
    private String employeePositionTitle;
    private String employeePhoto;

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(String employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int EmployeeAge) {
        this.employeeAge = EmployeeAge;
    }

    public long getEmployeePhnNumber() {
        return employeePhnNumber;
    }

    public void setEmployeePhnNumber(long EmployeePhnNumber) {
        this.employeePhnNumber = EmployeePhnNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String EmployeeEmail) {
        this.employeeEmail = EmployeeEmail;
    }

    public Date getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(Date EmployeeStartDate) {
        this.employeeStartDate = EmployeeStartDate;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String EmployeeLevel) {
        this.employeeLevel = EmployeeLevel;
    }

    public String getEmployeeTeamInfo() {
        return employeeTeamInfo;
    }

    public void setEmployeeTeamInfo(String EmployeeTeamInfo) {
        this.employeeTeamInfo = EmployeeTeamInfo;
    }

    public String getEmployeePositionTitle() {
        return employeePositionTitle;
    }

    public void setEmployeePositionTitle(String EmployeePositionTitle) {
        this.employeePositionTitle = EmployeePositionTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    @Override
    public String toString(){
        return (String.valueOf(employeeId));
    }
    
    
    
}
