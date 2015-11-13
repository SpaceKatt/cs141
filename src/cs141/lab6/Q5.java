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
public class Q5 {
    public static void main(String[] arg) {
        Scanner in = new Scanner (System.in);
        int[] number = new int[2];
        System.out.print("What is our first number?>>> ");
        number[0] = in.nextInt();
        System.out.print("What is our second number?>>> ");
        number[1] = in.nextInt();
        while (number[0] != 0 && number[1] != 0) {
            number = gcd(number);
            System.out.println("Our first number: " + number[0]);
            System.out.println("Our second number: " + number[1]);
        }
        System.out.println("\n And now that we are done...");
        System.out.println("Our first number: " + number[0]);
        System.out.println("Our second number: " + number[1]);
    }
    
    public static int[] gcd(int[] number) {
        if (number[0] < number[1]) {
            number[1] = number[1] - number[0];
        } else if (number[0] > number[1]) {
            number[0] = number[0] - number[1];
        } else {
            System.out.println("We have hit the bottom!");
            System.exit(0);
        }
        return number;
    }
}
