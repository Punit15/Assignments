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
public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int temp = n;int a=n;
        int sum=0;
        while(n>0)
        {
           n = n/10; 
           count++;
           //System.out.println(count);
        }
        while(temp>0)
        {
            int rem = temp % 10;
            temp = temp/10;
            sum = (int) (sum + Math.pow(rem,count));
           // System.out.println("rem"+rem+"sum"+sum);
        }
        
        if(a==sum)
            System.out.println("Number is Armstrong.");
        else
            System.out.println("Number is not Armstrong.");
    }
}
