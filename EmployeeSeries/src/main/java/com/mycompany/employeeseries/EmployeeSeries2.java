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
        System.out.println("HOURLY EMPLOYEE");
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
        
    
        System.out.println("\n\nPIECE WORKER EMPLOYEE");
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
    }
    
  
}
