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
public class swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I:");
        int i = sc.nextInt();
        System.out.println("Enter J:");
        int j = sc.nextInt();
        
        i = i+j;
        j = i-j;
        i = i-j;
        System.out.println("After Swapping I="+i+" and J="+j);
    }
}
