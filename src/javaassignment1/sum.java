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
public class sum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter First Number:");
        int a = sc.nextInt();
        System.out.println("\nEnter second Number:");
        int b = sc.nextInt();
        
        System.out.println("Sum of two number is:"+(a+b));
    }
    
}
