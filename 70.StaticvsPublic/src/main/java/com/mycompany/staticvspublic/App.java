/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.staticvspublic;

/**
 *
 * @author Ramavhale Murendeni
 */
public class App {

    //static method
    static void myStaticMethod(){
    System.out.println("static methods can be called without creating objects");
    }
    
     //public method
    public void myPublicMethod(){
    System.out.println("public methods must  be called by creating objects");
    }
    
    //main methord
    public static void main(String[] args) {
    
        myStaticMethod();//call the static method
        //myPublivMethord();//This would compile an error
        
        App myObj = new App();//create an object of main
        myObj.myPublicMethod();//call the public method on the object
        
    }
}
