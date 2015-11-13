/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

/**
 *
 * @author thomas.kercheval
 */
public class Q2 {
//    public static void main(String[] args) {
//        int n = 100; // Number to sum to
//        int count = 0;
//        for (int i = 1; i < (n+1); i++) {
//            count += i;
//        }
//        System.out.println("We take the sum of numbers to " + n);
//        System.out.println("Which is: " + count);
//    }
    public static void main(String[] args) {
        int n = 100; // Number to sum to
        int count = 0;
        int i = 1;
        do {
            count += i;
            i++;
        } while (i <= n);
        System.out.println("We take the sum of numbers to " + n);
        System.out.println("Which is: " + count);
    }
}
