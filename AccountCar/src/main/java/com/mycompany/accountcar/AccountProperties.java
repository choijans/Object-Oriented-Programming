/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcar;

/**
 *
 * @author janse
 */
public class AccountProperties {
    private double currBalance = 0;
    private double availableBalance = 0;
    private String accountName;
    private int accountNumber;

    public AccountProperties(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void verify(){
        this.availableBalance = this.currBalance;
    }
    
    public double getCurrBalance() {
        return currBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
    
    public boolean deposit(double amount){
        if(amount % 100 == 0){
            this.currBalance += amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount){
        if(this.availableBalance - (amount+10) <= 0 && amount % 100 == 0){
            return false;
        } else {
            this.availableBalance -= amount+10;
            this.currBalance -= amount+10;
            return true;
        }
    }
    
    public double checkBalance(){
        return 0;
        
    }
    
    public boolean transfer(AccountProperties a, double amount){
        if(this.availableBalance - (amount+10) >= 0 && amount % 100 == 0){
            a.deposit(amount);
            this.withdraw(amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nAccount ID: ");
        sb.append(accountNumber);
        sb.append("\nAccount Name: ");
        sb.append(accountName);
        sb.append("\nCurrent Balance: ");
        sb.append(currBalance);
        sb.append("\nAvailable Balance: ");
        sb.append(availableBalance);
                
        return sb.toString();
    }
    
//    public void display(){
//        System.out.println("Account ID: " + this.accountNumber);
//        System.out.println("Account Name: " + this.accountName);
//        System.out.println("Current Balance: " + this.currBalance);
//        System.out.println("Available Balance: " + this.availableBalance);
//    }
    public void display(){
        System.out.println(this);
    }
}
