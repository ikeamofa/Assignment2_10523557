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
public class Q63b{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        
        int count1 = 3 ;
        int count2 = 3 ;
        int count3 = 3 ;
     while(count1 != 0 && count2 != 0 && count2!= 0)
     {
        System.out.print("Choose a pile: ");
        String choice = sc.next();
        if(choice.equals("A"))
        {
            System.out.print("How many to remove from pile " + choice + ":");
            sc.nextInt();
            count1--;
            
        }
        else if(choice.equals("B"))
        {
            System.out.print("How many to remove from pile " + choice + ":");
            sc.nextInt();
            count2--;
            
        }
        if(choice.equals("C"))
        {
            System.out.print("How many to remove from pile " + choice + ":");
            sc.nextInt();
            count3--;
        }      
        }
     
        System.out.println("All piles are empty. Good job!");
        
        
    }
}
