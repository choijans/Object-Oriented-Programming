/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author janse
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished; 
    private double ratePerPiece;
    
    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(Employee e){
        super(e.empID, e.empName);
    }
    
    public PieceWorkerEmployee(Employee e, int totalPiecesFinished, double ratePerPiece){
        super(e.empID, e.empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, String empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }
    
    public double computeSalary(){
        if(this.totalPiecesFinished < 100){
            return this.ratePerPiece * this.totalPiecesFinished;
        } else {
            int temp = (this.totalPiecesFinished/100);
            return this.totalPiecesFinished*((temp*10)+this.ratePerPiece); 
        }
    }
    
    public void displayPieceWorkerEmployee(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nRate per Piece: ").append(ratePerPiece);
        sb.append("\nTotal Pieces Finished: ").append(totalPiecesFinished);
        sb.append("\nComputed Piece Salary: ").append(computeSalary());
        return sb.toString();
    }
}
