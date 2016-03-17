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
public class Q55 {
     public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("I will add up the numbers you give me.");
        int sum = 0  ;
        System.out.print("Number: ");
        int input = sc.nextInt();
        sum = sum + input ;
        System.out.println("The total so far is " + sum);
        
        while(input != 0)
        {
            System.out.print("Number: ");
            input = sc.nextInt() ;
            System.out.println("The total so far is " + (sum + input));
             sum = sum + input ;
        }
        if(input == 0)
        {
            System.out.println("The total is " + sum);
            
        }    
    }
    
}
