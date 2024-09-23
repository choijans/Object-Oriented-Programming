/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(Employee e) {
        super(e);
    }

    public BasePlusCommissionEmployee(double totalSales, Employee e) {
        super(totalSales, e);
    }

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(double totalSales, int empID, String empName, double baseSalary) {
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

//    public double getBaseSalary() {
//        return baseSalary;
//    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeBasePlusCommission(){
        return super.computeSalary() + this.baseSalary;
    }
    
    public void displayBPCEmployee(){
        System.out.println(this.toString());
        System.out.printf("Computed Salary: %.2f\n", computeBasePlusCommission());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nBase Salary ").append(totalSales);
        return sb.toString();
    }
    
}

