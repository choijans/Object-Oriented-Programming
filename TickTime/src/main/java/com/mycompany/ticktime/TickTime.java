/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ticktime;

/**
 *
 * @author janse
 */
public class TickTime {

    public static void main(String[] args) {
        myTime x = new myTime(11, 59, 59);

        System.out.println(x);
//        x.tickBySecond();
//        System.out.println(x);
//        x.tickBySecond();
//        System.out.println(x);

        x.advanceTime(43200);
        System.out.println(x);
    }
}
