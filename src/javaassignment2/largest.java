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
public class largest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int x = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
        System.out.println("Largest is:"+x);
    }
    
}
