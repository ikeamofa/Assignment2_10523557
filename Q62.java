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
public class Q62 {
     public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Starting number: ");
        int num = sc.nextInt() ;
        while(num != 1)
        {
            if (num % 2 == 0)
            {
                num = num/2 ;
                System.out.print(num +"\t");
            }
            else
            {
                num = num*3 + 1 ;
                System.out.print(num + "\t");
                
            }
            
        }
    }
    
}
