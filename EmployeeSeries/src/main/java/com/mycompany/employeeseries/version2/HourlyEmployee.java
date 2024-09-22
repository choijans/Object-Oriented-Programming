/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(Employee e){
        super(e.empID, e.empName);
    }
    
    public HourlyEmployee(Employee e, float totalHoursWorked, double ratePerHour){
        super(e.empID, e.empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, int empID, String empName) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
    
    public double computeSalary() {
        if (this.totalHoursWorked <= 40) {
            return this.ratePerHour * this.totalHoursWorked;
        } else {
            float overtimeHours = this.totalHoursWorked - 40;
            return (40 * this.ratePerHour) + (overtimeHours * this.ratePerHour * 1.5);
        }
    }
    
    public void displayHourlyEmployee() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nTotal Hours Worked: ").append(totalHoursWorked);
        sb.append("\nRate Per Hour: ").append(ratePerHour);
        sb.append("\nComputed Salary: ").append(computeSalary());
        return sb.toString();
    }
}
