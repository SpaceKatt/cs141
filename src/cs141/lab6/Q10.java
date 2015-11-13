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
public class Q10 {
    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--) {
//            int years = 100 * (i - 1);
//            System.out.println("Century " + i + " BC " + years+"-"+(years+99));
//        }
//        for (int i = 1; i < 6; i++) {
//            int years = 100 * (i - 1);
//            System.out.println("Century " + i + " AD " + years+"-"+(years+99));
//        }
        for (int i = -5; i < 6; i++) {
            int years = 100 * (Math.abs(i) - 1);
            if (i < 0) {
                System.out.println("Century " + Math.abs(i) + " BC " + years+"-"+(years+99));
            } else if (i > 0) {
                System.out.println("Century " + i + " AD " + years+"-"+(years+99));
            }
        }
    }
}
