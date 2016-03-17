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
public class Q67 {
      public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Count from: ");
        int from = sc.nextInt() ;
        
        System.out.print("Count to: ");
        int to = sc.nextInt() ;
        
        System.out.print("Count by: ");
        int by = sc.nextInt() ;
        
        for(int i = from; i <= to ;i = i + by)
        {
            System.out.print(i + " ");
        }
    }
    
}
