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
public class Q54 {
    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in) ;
        Random r = new Random();
        int num = 1 + r.nextInt(100) ;
        int guesses = 0 ;
        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        System.out.print( "First guess : ");        
        int input = sc.nextInt() ;
        guesses++ ;
        while(input != num && guesses < 7)
        {
            System.out.print("Guess # " + (guesses+1)  + " :");
            input = sc.nextInt() ;
            if (input < num)
            {
                System.out.println("Sorry, you are too low.");
            }
            else if (input > num)
                {
                    System.out.println("Sorry, you are too high ");
                }
            guesses++;
        }
        
        if (input == num)
        {
            System.out.println("You guessed right! What are the odds?!?");
        }
        else if(guesses >= 7)
        {
            System.out.println("Sorry, you didn't guess it in " + guesses + " tries.  You lose.");
        }
        
    }
    
}
