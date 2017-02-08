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
public class oddeven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a Number:");
        int n = sc.nextInt();
        
        if (n%2==0) {
            System.out.println("Number is Even.");
        }
        else
            System.out.println("Number is Odd.");
        
    }
}
