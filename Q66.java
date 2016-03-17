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
public class Q66 {
      public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Count to: ");
        int times = sc.nextInt() ;
        for(int i = 0;i <= times; i++)
        {
            System.out.print(i + " ");
        }
        
    }
    
}
