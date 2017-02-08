/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;

/**
 *
 * @author punit
 */
public class pattern3 {
    
    public static void main(String args[])
    {   
        int n=5;
        int space=4;
        for(int i=1; i<=n; i++)
        {

            for(int j=1; j<=space;j++)
                System.out.print(" ");
             
            for(int j=1; j<=i; j++)
                System.out.print("* ");
             
            System.out.println();
            space--;
             
        }
    }
    
}
