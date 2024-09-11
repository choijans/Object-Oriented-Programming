/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries;
import com.mycompany.employeeseries.version1.HourlyEmployee;
import com.mycompany.employeeseries.version1.PieceWorkerEmployee;
import com.mycompany.employeeseries.version1.CommissionEmployee;
import com.mycompany.employeeseries.version1.BasePlusCommissionEmployee;
/**
 *
 * @author User
 */
public class EmployeeSeries {

    public static void main(String[] args) {
//          HourlyEmployee hr1 = new HourlyEmployee(41, 100, "Jansen", 1);
//          hr1.displayHourlyEmployee();

//          PieceWorkerEmployee pr1 = new PieceWorkerEmployee(300, 100, "Jansen", 1);
//          pr1.displayHourlyEmployee();

//          CommissionEmployee ce1 = new CommissionEmployee(100000, "Jansen", 1);
//          ce1.displayHourlyEmployee();

            BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(100000, 500, "Kurt", 1);
            bpce1.displayHourlyEmployee();
    }
}
