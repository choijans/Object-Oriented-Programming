/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries;
import com.mycompany.employeeseries.version3.*;
/**
 *
 * @author User
 */
public class EmployeeSeries3 {
    public static void main(String[] args){
        HourlyEmployee test1 = new HourlyEmployee(140, 200, new EmpName("dusky","saballa","EEE"),new Date(2004,8,5), new Date(2024,9,15), 1001);
        PieceWorkerEmployee test2 = new PieceWorkerEmployee(15000, 40, new EmpName("jansen","choi","kkk"),new Date(2004,8,5), new Date(2024,9,15), 1002);
        CommissionEmployee test3 = new CommissionEmployee(50000, new EmpName("josh","lui","jio"),new Date(2004,5,5), new Date(2024,9,15), 1003);
        BasePlusCommissionEmployee test4 = new BasePlusCommissionEmployee(15000, 2000, new EmpName("dusky","saballa","test"),new Date(2004,5,5), new Date(2024,9,15), 1004);
        test1.display();
        test2.display();
        test3.display();
        test4.display();
    }
    
    
}
