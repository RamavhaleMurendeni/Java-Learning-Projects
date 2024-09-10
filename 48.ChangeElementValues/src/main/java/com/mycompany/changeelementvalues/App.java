/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.changeelementvalues;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);//outputs 9 instead 7
        
    }
}
