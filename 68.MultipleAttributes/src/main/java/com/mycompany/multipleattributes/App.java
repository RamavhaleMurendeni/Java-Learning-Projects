/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipleattributes;

/**
 *
 * @author Ramavhale Murendeni
 */
public class App {
    
    String fname = "Murendeni";
    String lname = "Ramavhale";
    int age = 24;

    public static void main(String[] args) {
        
        App myObj = new App();
        System.out.println("Name: "+ myObj.fname +" " + myObj.lname);
        System.out.println("Age: "+ myObj.age);
    }
}
