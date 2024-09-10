/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haltingconditinexample;

/**
 *
 * @author Lenovo-User
 */
public class App {

    
    public static void main(String[] args) {
        
        int result = sum(5, 10);
          System.out.println(result);
        
        
    }
    
    public static int sum(int start, int end){
    if(end > start){
    return end + sum(start, end -1);
    }
    else{
    return end;
    }
    }
}
