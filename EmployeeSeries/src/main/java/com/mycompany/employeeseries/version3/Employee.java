/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version3;
/**
 *
 * @author User
 */
public class Employee {
    public EmpName name;
    public Date dateHired;
    public Date dob;
    public int id;

    public Employee() {
    }
    
    public Employee(EmpName name, Date dateHired, Date dob) {
        this.name = new EmpName(name.getfName(), name.getlName(), name.getmName());
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.dob = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public Employee(EmpName name, Date dateHired, Date dob, int id) {
        this.name = new EmpName(name.getfName(), name.getlName(), name.getmName());
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.dob = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.id = id;
    }

    public EmpName getName() {
        return name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public Date getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public void setName(EmpName name) {
        this.name = new EmpName(name.getfName(), name.getlName(), name.getmName());
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public void setDob(Date dob) {
        this.dob = new Date(dob.getDay(), dob.getMonth(), dob.getYear());
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee Name: ").append(name.lName).append(", ").append(name.fName).append(", ").append("name.mName");
        sb.append("\nEmployee ID: ").append(id);
        sb.append("\nDate Hired: ").append(dateHired.month).append("/").append(dateHired.day).append("/").append(dateHired.year);    
        return sb.toString();
    }
    
}
