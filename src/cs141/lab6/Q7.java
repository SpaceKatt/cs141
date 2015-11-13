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
public class Q7 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int count = summ(i);
            System.out.print("The sum of positive integers from ");
            System.out.print(1 + " to " + i + " is " + count + "\n");
        }
    }
    
    public static int summ(int limit) {
        int count = 0;
        for (int i = 1; i < (limit+1); i++) {
            count += i;
        }
        return count;
    }
}
