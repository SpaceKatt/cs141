/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.util.Scanner;

/**
 *
 * @author thomas.kercheval
 */
public class Q12 {
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Please enter a number, 0 to quit: "); 
       int n = in.nextInt();

       int i; 
       for(i = 1; i < (Math.log(n * n)/Math.log(2)); i++) {}

       System.out.println("2 raised to " + i 
             + " is the first power of two greater than " + n + " squared"); 
    } 
}
