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
public class Q4 {
    public static void main(String[] args) {
        int evenTot = 0;
        int oddTot = 0;
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int value = in.nextInt();
            if ((value / 2) * 2 == value) {
                evenTot++;
            } else {
                oddTot++;
            }
        }
        System.out.println("DONE!");
        System.out.println("Even numbers: " + evenTot);
        System.out.println("Odd numbers: " + oddTot);
    }
}
