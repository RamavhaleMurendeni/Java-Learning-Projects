/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastrings;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        String greeting = "Hello";
        System.out.println(greeting);
        
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The lenght of the txt is:" +txt.length());
        
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        
    }
}
