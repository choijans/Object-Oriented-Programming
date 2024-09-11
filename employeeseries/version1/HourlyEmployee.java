/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        if(this.totalHoursWorked <= 40){
            return this.ratePerHour * this.totalHoursWorked;
        } else {
            int remainder = (int)this.totalHoursWorked - 40;
            return (this.ratePerHour *(this.totalHoursWorked - remainder) + (remainder * this.ratePerHour * 1.5));
        }
    }
    
    public void displayHourlyEmployee(){
//        System.out.println("Employee ID: " + this.empID);
//        System.out.println("Employee Name: " + this.empName);
//        System.out.println("Rate per Hour: " + this.ratePerHour);
//        System.out.println("Total Hours Worked: " + this.totalHoursWorked);
//        System.out.println("Total Salary: " + computeSalary());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        sb.append("\nTotal Hours Worked: ").append(totalHoursWorked);
        sb.append("\nTotal Rate Per Hour: ").append(ratePerHour);
        sb.append("\nTotal Salary: ").append(computeSalary());
        return sb.toString();
    }
}


