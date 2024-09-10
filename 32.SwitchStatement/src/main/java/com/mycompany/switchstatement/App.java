/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchstatement;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int day = 4;
        switch(day){
        
            case 1:
                System.out.println("Monday");
                break;
                
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("Wednesday");
                break;
           
            case 4:
                System.out.println("Thursday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
                
            case 6:
                System.out.println("Saturday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;
        }
        // outputs "Thursday"(day 4)
    }
}
