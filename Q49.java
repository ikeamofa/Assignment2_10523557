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
public class Q49 {
     public static void main(String [] args)
    {
        Random r = new Random() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        int input = sc.nextInt() ;
        
        int guess = 1 + r.nextInt(10);
        while(input != guess)
        {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess is: ");
            input = sc.nextInt();
        }
        
        System.out.println("That's right! You're a good guesser.");
    }
    
}
