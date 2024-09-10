/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javarecursionexample;

/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
        
        int result = sum(10);
          System.out.println(result);
        
    }
    
    public static int sum(int k){
    if (k > 0){
    
        return k + sum(k - 1);
    }else{
        return 0;
    }
    }
}
