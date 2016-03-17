/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Q58 {
     public static void main(String args[] )
    {
        Random r = new Random() ;
        int roll_1 ;
        int roll_2 ;
    do
     {
        roll_1 = 1 + r.nextInt(6) ;
        roll_2 = 1 + r.nextInt(6) ;
        System.out.println("Roll #1: " + roll_1);
        System.out.println("Roll #2: " + roll_2);
        
        System.out.println("The total is " + (roll_1 + roll_2) + "!");
     }  while(roll_1 != roll_2) ;
    }
    
}
