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
public class Q51 {
     public static void main(String args[] )
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Type in a message and I will type it several times");
        System.out.print("Message: ");
        String input = sc.next() ;
        System.out.println("How many times?");
        int n = sc.nextInt();
        
        int m = 0,y = 0 ;
        while(y < n)
        {
            System.out.println((m+10) + ". " + input) ;
            y++ ;
            m += 10;
            
        }
    }
    
}
