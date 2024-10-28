/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee {
    public double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(Employee e) {
         super(e.empID, e.empName);
    }

    public CommissionEmployee(double totalSales, Employee e) {
        super(e.empID, e.empName);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(double totalSales, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary(){
        if(this.totalSales < 10000){
            return this.totalSales * 0.05;
        } else if(this.totalSales >= 10000 && this.totalSales < 100000){
            return this.totalSales * 0.1;
        } else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            return this.totalSales * 0.2;
        } else {
           return this.totalSales * 0.3;
        }
    }    

    public void displayCommissionEmployee(){
        System.out.println(this.toString());
        System.out.printf("Computed Salary: %.2f\n", computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nTotal Sales: ").append(totalSales);
        return sb.toString();
    }
}
