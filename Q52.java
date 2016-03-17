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
public class Q52 {
     public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        int pin = 1234 ;
        int tries = 0,max = 4  ;
        
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("Enter your pin : ");
        int input = sc.nextInt() ;
        tries++ ;
        
        while(input != pin && tries < max)
        {
            System.out.println("Incorrect password, Try again");
            System.out.print("Enter your password: ");
            input = sc.nextInt() ;
            tries ++ ;
        }
        
        if(input == pin)
        {
            System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
        }
        else if(tries >= max)
        {
            System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
        }
        
    }
    
}
