/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.changeanarrayelement;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        String[] cars = {"Volvo","BMW","Ford","Mazsa"};
        cars[0] = "Opel";
        
        System.out.println(cars[0]);
        //Now outputs Opel instes of volvo
        
    }
}
