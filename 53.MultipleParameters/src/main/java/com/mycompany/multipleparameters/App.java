/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipleparameters;

/**
 *
 * @author Lenovo-User
 */
public class App {
    
    static void myMethod(String fname, int age){
      System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
       
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
        
    }
}
//Liam is 5
//Jenny is 8
//Anja is 31