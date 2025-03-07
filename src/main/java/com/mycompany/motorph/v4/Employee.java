/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph.v4;



/**
 *
 * @author KrisChan
 */
import java.time.LocalDate;

public class Employee {
    private String employeeId;
    private String lastName;
    private String firstName;
    private String birthDay;
    private String address;
    private String phoneNumber;
    private String sss;
    private String philhealth;
    private String tin;
    private String pagibig;
    private String status;
    private String position;
    private String department;
    private String supervisor;
    private int basicSalary;
    private int riceSubsidy;
    private int phoneAllowance;
    private int clothingAllowance;
    private int grossSemiMonthlyRate;
    private double hourlyRate;
    private String username;
    

    // Constructor
    public Employee(String employeeId, String lastName, String firstName, String username, String birthDay, String address,
                    String phoneNumber,  String status,
                    String position, String department, String supervisor, int basicSalary, double hourlyRate
                    ) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.address = address;
        this.phoneNumber = phoneNumber;
        
        this.status = status;
        this.position = position;
        this.department = department;
        this.supervisor = supervisor;
        this.basicSalary = basicSalary;
        
        this.username = username;
        this.hourlyRate= hourlyRate;
    }

    // Getters and Setters
    public String getEmployeeId() { return employeeId; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getBirthDay() { return birthDay; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getSss() { return sss; }
    public String getPhilhealth() { return philhealth; }
    public String getTin() { return tin; }
    public String getPagibig() { return pagibig; }
    public String getStatus() { return status; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    public String getSupervisor() { return supervisor; }
    public int getBasicSalary() { return basicSalary; }
    public int getRiceSubsidy() { return riceSubsidy; }
    public int getPhoneAllowance() { return phoneAllowance; }
    public int getClothingAllowance() { return clothingAllowance; }
    public int getGrossSemiMonthlyRate() { return grossSemiMonthlyRate; }
    public double getHourlyRate() { return hourlyRate; }
    public String getUsername() { return username; }
     
}

