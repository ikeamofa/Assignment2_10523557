/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q43 {
    public static void main (String [] args)
    {
        Random r = new Random();
        int comp_guess = 1 + r.nextInt(10) ;
        Scanner sc = new Scanner(System.in);
        System.out.println("I am thinking of a number from 1 to 5");
        int guess = sc.nextInt() ;
        
        System.out.println("Your guess is: " + guess);
        System.out.println();
        if(comp_guess == guess )
        {
            System.out.print("That's right! Secret number was " + comp_guess);
        }
        else
        {
            System.out.print("Sorry, but I was really thinking of " + comp_guess);
        }
        
    }
}
