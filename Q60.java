/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q60 {
     public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        double num ;
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        num = sc.nextDouble();
        while(num < 0 )
        {
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.print("Try again: ");
            num = sc.nextDouble() ;
            
        }
        System.out.println("The square root of " + num + " is " + Math.sqrt(num))  ;
    }
    
}
