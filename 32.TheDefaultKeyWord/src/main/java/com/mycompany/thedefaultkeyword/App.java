/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thedefaultkeyword;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int day =4;
        
        switch(day){
        
            case 6:
                System.out.println("Today is saturday");
                break;
                
            case 7:
                System.out.println("Today is Sunday");
                break;
                
            default:
                System.out.println("Looking forward to the weekend");
            
        }
        //Outputs "Looking forward to the weekend"
    }
}
