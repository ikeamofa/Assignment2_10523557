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
public class Q63 {
     public static void main(String args[] )
    {
       Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
"\"kitchen\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("kitchen") )
					nextroom = 2;
				else if ( choice.equals("upstairs") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
"there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"\n" +
"or go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
                            switch (choice) {
                                case "back":
                                    nextroom = 1;
                                    break;
                                case "refrigerator":
                                    nextroom = 5;
                                    break;
                            }
			}
			if ( nextroom == 3 )
			{
				System.out.println( "Upstairs you see a hallway.  At the end of the hallway is the master\n" +
"\"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can\n" +
"go back \"downstairs\". Where would you like to go?" );
				
                                System.out.print( "> " );
				choice = keyboard.nextLine();
				
				if ( choice.equals("downstairs") )
					nextroom = 1;
				else if ( choice.equals("bathroom") )
					nextroom = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 5 )
			{
				System.out.println( "Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
"Would you like to eat some of the food? (\"yes\" or \"no\")" );
				
                                System.out.print( "> " );
				choice = keyboard.nextLine();
				
				if ( choice.equals("yes") )
					nextroom = 6;
				else if ( choice.equals("no") )
					nextroom = 4;
			}
                        if (nextroom == 6)
                        {
                            System.out.println("The food is slimy and foul, but you manage to choke it down. Your stomach\n" +
"starts jumping like a frog in hot water.  You feel faint. Sliding to the\n" +
"floor, the darkness closes in.\n" +
"");
                            System.out.println("You have died");
                            nextroom = 0 ;
                        }
				
		}

		
	}
        
    }
    

