/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parametersandarguments;

/**
 *
 * @author Lenovo-User
 */
public class App {
    
    static void myMethod(String fname){
      System.out.println(fname + "Refsnes");
    }

    public static void main(String[] args) {
        
        myMethod("Liam ");
        myMethod("Jenny ");
        myMethod("Anja ");
        
    }
}
//Liam Refsnes
//Jenny Refsnes
//Anja Refsnes