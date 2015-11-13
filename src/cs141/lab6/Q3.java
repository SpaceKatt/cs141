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
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean exit = false;
        int sum = 0;
        System.out.println("Enter intergers to sum them");
        System.out.println("Enter `q` to quit");
        while (!exit) {
            System.out.print("Enter an interger: ");
            String userIn = in.next();
            try {
                sum += Integer.parseInt(userIn);
            } catch (NumberFormatException e) {
                if (userIn.equals("q")) {
                    System.out.println("Grand total: " + sum);
                    System.exit(0);
                } else {
                    System.out.println("Please follow the directions...");
                }
            } finally {
                System.out.print("... ");
            }
        }
    }
}
