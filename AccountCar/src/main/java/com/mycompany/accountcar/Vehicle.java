/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcar;

/**
 *
 * @author janse
 */
public class Vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled = false;

    public Vehicle(int topSpeed, int currSpeed, String color, String model, String manufacturer, String plateNumber, boolean disabled) {
        this.topSpeed = topSpeed;
        this.currSpeed = currSpeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = disabled;
    }
    
    public boolean accelerate(){
        if(this.currSpeed + 10 > this.topSpeed){
            this.disabled = true;
            return false;
        } else {
            this.currSpeed += 10;
            return true;
        }
    }
    
    public boolean decelerate(){
        if(this.currSpeed - 10 < 0){
            return false;
        } else {
            this.currSpeed -= 10;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nTop Speed: ");
        sb.append(topSpeed);
        sb.append("\nCurrent Speed: ");
        sb.append(currSpeed);
        sb.append("\nColor: ");
        sb.append(color);
        sb.append("\nModel: ");
        sb.append(model);
        sb.append("\nManufacturer: ");
        sb.append(manufacturer);
        sb.append("\nPlate Number: ");
        sb.append(plateNumber);
        sb.append("\nDisabled: ");
        sb.append(disabled);
                
        return sb.toString();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
}
