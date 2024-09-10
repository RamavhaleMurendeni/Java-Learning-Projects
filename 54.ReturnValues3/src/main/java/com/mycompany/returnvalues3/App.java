/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnvalues3;

/**
 *
 * @author Lenovo-User
 */
public class App {

    static int myMethod(int x, int y){
    return x + y;
    }
    
    public static void main(String[] args) {
        
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
//Outputs 8 (5 + 3)