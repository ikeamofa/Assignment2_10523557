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
public class Q48 {
     public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int pin = 1234 ;
        
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
	System.out.print("ENTER YOUR PIN: ");
        int entry = sc.nextInt() ;
        
        while(entry != pin)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = sc.nextInt() ;

            
        }
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");


        
        
        
    }
    
}
