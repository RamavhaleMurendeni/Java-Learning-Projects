/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalkeywordonclasses;

/**
 *
 * @author Ramavhale Murendeni
 */
public class App {
    
    final int x = 10;

    public static void main(String[] args) {
        
        App myObj = new App();
        myObj.x = 25; //will generate an error cannot assing a valur to a final variable
        System.out.println(myObj.x);
    }
}
