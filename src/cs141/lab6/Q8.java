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
public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean exit = false;
        int sum = 0;
        System.out.println("Enter intergers to find their gcd.");
        System.out.println("Enter `q` to quit");
        while (!exit) {
            int[] number = new int[2];
            System.out.print("\nEnter your first number>>> ");
            String userInOne = in.next();
            number[0] = parseIntt(userInOne);
            System.out.print("What is our second number?>>> ");
            String userInTwo = in.next();
            number[1] = parseIntt(userInTwo);
            notMain(number);
        }
    }
    
    public static int parseIntt(String thing) {
        try {
                int number = Integer.parseInt(thing);
            } catch (NumberFormatException e) {
                if (thing.equals("q")) {
                    System.out.println("\nGoodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Please follow the directions...");
                }
            }
        return Integer.parseInt(thing);
    }
    
    public static void notMain(int[] number) {
        System.out.println("\n");
        while (number[0] != 0 && number[1] != 0) {
            number = gcd(number);
            System.out.println("Our first number: " + number[0]);
            System.out.println("Our second number: " + number[1]);
        }
        System.out.println("\n And now that we are done...");
        System.out.println("Our greatest common denominator: " + number[0]);
    }
    
    public static int[] gcd(int[] number) {
        if (number[0] < number[1]) {
            number[1] = number[1] - number[0];
        } else if (number[0] > number[1]) {
            number[0] = number[0] - number[1];
        } else {
            number[1] = number[1] - number[0];
            System.out.println("We have hit the bottom!");
        }
        return number;
    }
}
