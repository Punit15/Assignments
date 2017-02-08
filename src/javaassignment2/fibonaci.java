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
public class fibonaci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter End poin of Fibonaci Series:");
        int n = sc.nextInt();
        
        int a = 0, b = 1,sum=0;
        System.out.println(""+a+"\n"+b);
        
        do{
            sum = a+b;
            a=b;
            b=sum;
            System.out.println(""+sum);
        }while(sum<=n);
    }

    
    
}
