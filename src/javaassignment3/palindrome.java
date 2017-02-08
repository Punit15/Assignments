/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;

import java.util.Scanner;

/**
 *
 * @author punit
 */
public class palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int r = 0;
        int rem;
        
        while(n>0)
        {
            rem = n % 10;
            n = n/10;
            //System.out.println(""+n);
            r = r*10 + rem;  
            //System.out.println(""+r);
        }
        
        //System.out.println(""+r);
        if(temp==r)
            System.out.println("Given number is palindrome.");
        else
            System.out.println("Given number is not palindrome.");
    }
    
}
