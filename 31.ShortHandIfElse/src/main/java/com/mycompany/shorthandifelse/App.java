/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shorthandifelse;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int time = 20;
        if(time < 18){
            System.out.println("Good Day");
                    }else{
            System.out.println("Good Evening");
        }

        //we can also make it short
        int time2 = 20;
        String results;
        results = (time2 < 18 )? "Good day.": "Good evening.";
        System.out.println(results);
    }
}
