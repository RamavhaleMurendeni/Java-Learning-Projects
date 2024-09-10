/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipleobjects;

/**
 *
 * @author Ramavhale Murendeni
 */
public class App {

    int x = 5;
    
    public static void main(String[] args) {
        
         App myObj1 = new App();//object 1
         App myObj2 = new App();// object 2
         myObj2.x = 25;
         System.out.println(myObj1.x);// outputs 5
         System.out.println(myObj2.x);// outputs 25
    }
}
