/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries;
import com.mycompany.employeeseries.version2.*;

/**
 *
 * @author User
 */
public class EmployeeSeries2 {
    public static void main(String[] args) {
        System.out.println("----------HOURLY EMPLOYEE----------");
        HourlyEmployee emp1 = new HourlyEmployee();
        emp1.setEmpID(100); 
        emp1.setEmpName("Josh");
        emp1.setTotalHoursWorked(40);
        emp1.setRatePerHour(15.0);
        System.out.println("Constructor 1");
        emp1.displayHourlyEmployee(); 
        
        Employee e1 = new Employee(101, "John Doe");
        HourlyEmployee emp2 = new HourlyEmployee(e1);
        emp2.setTotalHoursWorked(38); 
        emp2.setRatePerHour(20.0);
        System.out.println("\nConstructor 2");
        emp2.displayHourlyEmployee();

        HourlyEmployee emp3 = new HourlyEmployee(e1, 45, 22.0);
        System.out.println("\nConstructor 3");
        emp3.displayHourlyEmployee(); 

        HourlyEmployee emp4 = new HourlyEmployee(50, 18.5);
        emp4.setEmpID(102);  
        emp4.setEmpName("Chris Evans");
        System.out.println("\nConstructor 4");
        emp4.displayHourlyEmployee();

        HourlyEmployee emp5 = new HourlyEmployee(35, 22.5, 103, "Jane Smith");
        System.out.println("\nConstructor 5");
        emp5.displayHourlyEmployee(); 
        
    
        System.out.println("\n\n----------PIECE WORKER EMPLOYEE----------");
        PieceWorkerEmployee pe1 = new PieceWorkerEmployee();
        pe1.setEmpID(200);  
        pe1.setEmpName("Default Worker");
        pe1.setTotalPiecesFinished(80);
        pe1.setRatePerPiece(12.5);
        System.out.println("Constructor 1: ");
        pe1.displayPieceWorkerEmployee();

        Employee temp1 = new Employee(201, "John Doe");
        PieceWorkerEmployee pe2 = new PieceWorkerEmployee(temp1);
        pe2.setTotalPiecesFinished(150);  
        pe2.setRatePerPiece(10.0);
        System.out.println("\nConstructor 2");
        pe2.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee pe3 = new PieceWorkerEmployee(e1, 110, 8.0);
        System.out.println("\nConstructor 3");
        pe3.displayPieceWorkerEmployee(); 

        PieceWorkerEmployee pe4 = new PieceWorkerEmployee(200, 15.0);
        pe4.setEmpID(202); 
        pe4.setEmpName("Chris Evans");
        System.out.println("\nConstructor 4");
        pe4.displayPieceWorkerEmployee();

        PieceWorkerEmployee pe5 = new PieceWorkerEmployee(180, 20.0, 203, "Jane Smith");
        System.out.println("\nConstructor 5");
        pe5.displayPieceWorkerEmployee();
        
        
        
        System.out.println("\n\n----------COMMISSION EMPLOYEE----------");
        CommissionEmployee ce1 = new CommissionEmployee();
        ce1.setEmpID(300);
        ce1.setEmpName("Default Commission Worker");
        ce1.setTotalSales(5000);
        System.out.println("Constructor 1:");
        ce1.displayCommissionEmployee();

        Employee temp2 = new Employee(301, "Alice Johnson");
        CommissionEmployee ce2 = new CommissionEmployee(temp2);
        ce2.setTotalSales(15000);
        System.out.println("\nConstructor 2:");
        ce2.displayCommissionEmployee();

        CommissionEmployee ce3 = new CommissionEmployee(25000, temp2);
        System.out.println("\nConstructor 3:");
        ce3.displayCommissionEmployee();

        CommissionEmployee ce4 = new CommissionEmployee(10000);
        ce4.setEmpID(302);
        ce4.setEmpName("Bob Brown");
        System.out.println("\nConstructor 4:");
        ce4.displayCommissionEmployee();

        CommissionEmployee ce5 = new CommissionEmployee(80000, 303, "Charlie Black");
        System.out.println("\nConstructor 5:");
        ce5.displayCommissionEmployee();
        
        
        
        System.out.println("\n\n-----------BASE PLUS COMMISSION EMPLOYEE-----------");
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee();
        bpce1.setEmpID(400);
        bpce1.setEmpName("Default Base Plus Worker");
        bpce1.setTotalSales(6000);
        bpce1.setBaseSalary(2000);
        System.out.println("Constructor 1:");
        bpce1.displayBPCEmployee();

        Employee temp4 = new Employee(401, "David Smith");
        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee(temp4);
        bpce2.setTotalSales(20000);
        bpce2.setBaseSalary(3000);
        System.out.println("\nConstructor 2:");
        bpce2.displayBPCEmployee();

        BasePlusCommissionEmployee bpce3 = new BasePlusCommissionEmployee(30000, temp4);
        bpce3.setBaseSalary(2500);
        System.out.println("\nConstructor 3:");
        bpce3.displayBPCEmployee();
        BasePlusCommissionEmployee bpce4 = new BasePlusCommissionEmployee(15000, 4000);
        bpce4.setEmpID(402);
        bpce4.setEmpName("Eve White");
        System.out.println("\nConstructor 4:");
        bpce4.displayBPCEmployee();

        BasePlusCommissionEmployee bpce5 = new BasePlusCommissionEmployee(90000, 403, "Frank Black", 5000);
        System.out.println("\nConstructor 5:");
        bpce5.displayBPCEmployee();
        
    }
    
  
}
