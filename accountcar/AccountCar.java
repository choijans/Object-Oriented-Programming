/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountcar;

/**
 *
 * @author janse
 */
public class AccountCar {
    public static void main(String[] args) {
        AccountProperties a1 = new AccountProperties("Jansen", 23102442);
        AccountProperties a2 = new AccountProperties("Jio", 21101024);
        
        a1.deposit(1000);
        a1.display();
        a1.verify();
        a1.display();
        a2.display();
        
        Vehicle v1 = new Vehicle(240, 230, "Blue", "Raize", "Toyota", "KFX 224", true);
        v1.decelerate();
        v1.display();
    }
}
