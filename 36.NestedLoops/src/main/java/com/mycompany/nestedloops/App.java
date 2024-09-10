/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nestedloops;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        //Outer loop
        
    for (int i = 1; i <= 2; i++ ){
    System.out.println("Outer: " + i);//Executes 2 times
    
    //inner loop
    for (int j = 1; j <= 3 ;j++){
    System.out.println("Inner: " +j );//Excetes 6 times(2*3)
    }
    }
    
    }
        
    }
}
