/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment1;

import java.util.Scanner;

/**
 *
 * @author punit
 */
public class prime {
    
    public static boolean isPrime(int n)
    {
        boolean status = false;
        
        for (int i = 2; i < n/2; i++) {
            if(n%2==0)
                status = false;
            else
                status = true;
        }
        return status;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        
        if(isPrime(sc.nextInt()))
            System.out.println("Number is Prime.");
        else
            System.out.println("Number is Not Prime.");
        
    }
}
