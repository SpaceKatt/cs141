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
public class Q9 {
    public static void main(String[] args) 
   {
      int millennium = 3000;
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the current year: ");

      int year = in.nextInt();
      int nyear = year;

      while (nyear != millennium)
      {
         nyear++;
      }
      int totalYears = nyear - year;
      while (totalYears > 999) {
          totalYears -= 1000;
      }
      System.out.println("Another " + totalYears + " years to the millennium.");
   }

}
