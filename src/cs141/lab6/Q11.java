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
public class Q11 {
    public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int sum = 0;
      int n = 1;

      do
      {
         System.out.print("Please enter a number, 0 to quit: "); 
         n = in.nextInt();
         if (n != 0) 
         {
            sum = sum + n;
            System.out.println("Sum = " + sum);
         } 
      } while (n != 0) ;
      System.out.println("Sum = " + sum);
   }

}
