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
public class Q47 {
    public static void main(String [] args)
    {
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
"He glances at you out of the corner of his eye and starts shuffling.\n" +
"He lays down three cards.\n" +
"");
        Scanner sc = new Scanner(System.in);
        Random r = new Random() ;
        int card = 1 + r.nextInt(3) ;
        System.out.println("Which one is the ace?");
        System.out.println("\t##  ##  ##");
        System.out.println("\t##  ##  ##");
        System.out.println("\t1   2   3");
        int guess = sc.nextInt() ;
        
       /* if (guess == card)
        {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n" +
"\n" +
"	##  AA  ##\n" +
"	##  AA  ##\n" +
"	1   2   3");
        }
        else if ()
        {
            System.out.println("Ha! Fast Eddie wins again! The card was card number " + card);
        } */
        
        if (guess == 1 && guess == card )
        {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("\tAA  ##  ##");
            System.out.println("\tAA  ##  ##");
        }
        
        else if (guess == 2 && guess == card )
        {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("\t##  AA  ##");
            System.out.println("\t##  AA  ##");
        }
        
        
        else if (guess == 3 && guess == card )
        {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("\t##  ##  AA");
            System.out.println("\t##  ##  AA");
        }
        
        
        else if (guess == 1 && card == 2 )
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card + ".");
            System.out.println("\t##  AA  ##");
            System.out.println("\t##  AA  ##");
        }
        
        else if (guess == 1 && card == 3 )
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card + ".");
            System.out.println("\t##  ##  AA");
            System.out.println("\t##  ##  AA");
        }
        
        else if (guess == 2 && card == 1 )
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card + ".");
            System.out.println("\tAA  ##  ##");
            System.out.println("\tAA  ##  ##");
        }
        
        else if (guess == 2 && card == 3 )
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card + ".");
            System.out.println("\t##  ##  AA");
            System.out.println("\t##  ##  AA");
        }
        
        else if (guess == 3 && card == 1 )
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card + ".");
            System.out.println("\tAA  ##  ##");
            System.out.println("\tAA  ##  ##");
        }
        else if (guess == 3 && card == 2 )
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card + ".");
            System.out.println("\t##  AA  ##");
            System.out.println("\t##  AA  ##");
        }
    }
    
}
