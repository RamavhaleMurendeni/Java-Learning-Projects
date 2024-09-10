/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loopthroughammultidimensionalarray;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int[][] myNumbers = {{1, 2, 3, 4},{4, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i){
        for (int j = 0; j <myNumbers[i].length; ++j){
        System.out.println(myNumbers[i][j]);
        }
        }
        
    }
}
