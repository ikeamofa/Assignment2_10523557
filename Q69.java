/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment;

/**
 *
 * @author HP
 */
public class Q69 {
      public static void main(String args[] )
    {
        double x = -10 ;
        System.out.println("x" + "\ty");
        System.out.println("-----------------");
        for(double i = x; i <= 10;i = i + 0.5 )
        {            
            System.out.println(i);
            double y = 0;
            for(double j = -10; j <= 10 ;j = j +0.5)
            {
               
                System.out.println("\t " + j*j); 
            }
        }
    }
    
}
