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
public class Q6 {
    public static void main(String[] args) {
//        for (int i = 1; i < 3; i++) {
//            for (int j = 1; j < 5; j++) {
//                System.out.println(i + "   " + j);
//            }
//        }
        
//        boolean done = false;
//        int i = 1;
//        while (!done) {
//            int j = 1;
//            while (j < 5) {
//                System.out.println(i + "   " + j);
//                j++;
//            }
//            i++;
//            if (i > 2) {done = true;}
//        }
        boolean done = false;
        int i = 1;
        do {
            int j = 1;
            while (j < 5) {
                System.out.println(i + "   " + j);
                j++;
            }
            i++;
            if (i > 2) {done = true;}
        } while (!done);
    }
}
