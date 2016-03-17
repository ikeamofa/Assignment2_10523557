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
public class Q41 {
    public static void main(String [] args)
    {
    Random r = new Random() ;
    int x = r.nextInt(10) ;
    
    System.out.println("Here are some random from 1 to 5");
    System.out.print(3 + r.nextInt(5) + " ");
    System.out.print(3 + r.nextInt(5) + " ");
    System.out.print(3 + r.nextInt(5) + " ");
    System.out.print(3 + r.nextInt(5) + " ");
    System.out.print(3 + r.nextInt(5) + " ");
    System.out.print(3 + r.nextInt(5) + " ");
    System.out.println();
    
    System.out.println("Here are some random from 1 to 100");
    System.out.print(1 + r.nextInt(100) + " ");
    System.out.print(1 + r.nextInt(100) + " ");
    System.out.print(1 + r.nextInt(100) + " ");
    System.out.print(1 + r.nextInt(100) + " ");
    System.out.print(1 + r.nextInt(100) + " ");
    System.out.print(1 + r.nextInt(100) + " ");
    System.out.println();
    
    int num1 = r.nextInt(10) ;
    int num2 = r.nextInt(10) ;
    
    if(num1 == num2)
    {
        System.out.println("Thats odd!");
    }
    else{
        System.out.println("Not so surprising actually");
    }
            }
}
