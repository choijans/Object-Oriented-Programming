/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries;
import com.mycompany.employeeseries.version5.*;
/**
 *
 * @author User
 */
public class EmployeeSeries5 {
    public static void main (String[] args) {
        HourlyEmployee test1 = new HourlyEmployee(140, 200, new EmpName("Dusky", "Saballa", "EEE"), new Date(2004, 8, 5), new Date(2024, 9, 15), 1001);
        PieceWorkerEmployee test2 = new PieceWorkerEmployee(15000, 40, new EmpName("Jansen", "Choi", "KKK"), new Date(2004, 8, 5), new Date(2024, 9, 15), 1002);
        CommissionEmployee test3 = new CommissionEmployee(50000, new EmpName("Josh", "Lui", "JIO"), new Date(2004, 5, 5), new Date(2024, 9, 15), 1003);
        BasePlusCommissionEmployee test4 = new BasePlusCommissionEmployee(15000, 2000, new EmpName("Dusky", "Saballa", "TEST"), new Date(2004, 5, 5), new Date(2024, 9, 15), 1004);

        // Create an EmployeeRoster instance and add employees
        EmployeeRoster emplist = new EmployeeRoster();
        emplist.addEmployee(test1);
        emplist.addEmployee(test2);
        emplist.addEmployee(test3);
        emplist.addEmployee(test4);
        emplist.displayAllEmployee();
        // Output counts
        System.out.printf("Count of CE: %d\n", emplist.countCE());
        System.out.printf("Count of PWE: %d\n", emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n", emplist.countBPCE());
        System.out.printf("Count of HE: %d\n", emplist.countHE());
        
        System.out.println("");
        emplist.displayHE();
        emplist.displayPWE();
        emplist.displayCE();
        emplist.displayBPCE();
        
    }
        
}
