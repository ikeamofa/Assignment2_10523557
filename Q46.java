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
public class Q46 {
    public static void main(String [] args)
    {
        Random r = new Random() ;
        int rNum = 1 + r.nextInt(100) ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int guess = sc.nextInt();
        
        if(rNum == guess)
        {
            System.out.println("You guessed it! What are the odds?!? ");
        }
        else if(rNum > guess)
        {
            System.out.println("Sorry, you are too high. I was thinking of " + rNum);
        }
        else if(rNum < guess){
            System.out.println("Sorry, you are too low. I was thinking of " + rNum);
    }
    
}
}