/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnvalues2;

/**
 *
 * @author Lenovo-User
 */
public class App {

    static int myMethod(int x,int y){
     return x + y;
    }
    
    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
    }
}
//outputs 8 (5 + 3)