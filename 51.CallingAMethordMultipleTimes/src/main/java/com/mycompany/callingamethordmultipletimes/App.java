/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.callingamethordmultipletimes;

/**
 *
 * @author Lenovo-User
 */
public class App {

    static void myMethod(){
        System.out.println("i just got executed!");
        
    }
    
    public static void main(String[] args) {

         myMethod();
         myMethod();
         myMethod();
        
    }
}
//i just got executed x3