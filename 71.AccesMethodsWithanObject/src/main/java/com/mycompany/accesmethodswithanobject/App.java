/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accesmethodswithanobject;

/**
 *
 * @author Ramavhale Murendeni
 */
public class App {

    //create a fullThrottle() method
    public void fullThrottle(){
    System.out.println("The car is going as fast as it can!");
    }
    
    //create a speed() method and add a parameter
    public void speed(int maxSpeed){
     System.out.println("Max spped is: " + maxSpeed );
    }
    
    //inside main,call the methods on the mycar object
    public static void main(String[] args) {
       
    App myCar = new App(); //create a mycar object
    myCar.fullThrottle(); //call the fullThrottle() method
    myCar.speed(200); // call the speed() method
    
 
    }
}
