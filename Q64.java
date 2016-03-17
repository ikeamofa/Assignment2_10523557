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
public class Q64 {
    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a message, and I'll display it ten times");
        System.out.print("Message: ");
        String msg = sc.nextLine() ;
        
        for(int n = 0;n < 10; n = n + 2)
        {
            System.out.println((n+2) + ". " + msg);
        }
    }
    
}
