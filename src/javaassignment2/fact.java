/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

import java.util.Scanner;

/**
 *
 * @author punit
 */
public class fact {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        
        int f = factorial(n);
        
        System.out.println("factorial is"+f);
    }

    private static int factorial(int n) {
            
        int result=0;
        
            if(n==0 || n==1)
            result = 1;
            else{
            result = factorial(n-1)*n;
            return result;
            }
            return result;
    }
}
