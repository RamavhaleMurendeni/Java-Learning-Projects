/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amethordwithifelse;

/**
 *
 * @author Lenovo-User
 */
public class App {

    //Create a chackAge() methord with an integer variable called age
    static void checkAge(int age){
    
    //if age is less than 18,print "acces denied"
    
    if (age < 18){
    System.out.println("Access denied -You are not old enough");
    }
    //if age is greater than,or equal to,18,print "access granted"
    else{
      System.out.println("Access Granted - you are old enough");
    }
    }
    
    public static void main(String[] args) {
        
        checkAge(20);//call the checkage methord and  pass along an age 0f 20
        
    }
}
//outputs ""Access Granted -You are old enough