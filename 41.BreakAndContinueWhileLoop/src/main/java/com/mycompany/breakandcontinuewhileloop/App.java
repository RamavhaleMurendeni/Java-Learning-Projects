/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.breakandcontinuewhileloop;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int i = 0;
        while (i < 10 ){
        if(i == 4){
        i++;
        continue;
        
        }
            System.out.println(i);
            i++;
        }
        
    }
}
