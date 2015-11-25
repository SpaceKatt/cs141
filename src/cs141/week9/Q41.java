/*
 * Copyright (C) 2015 thomas.kercheval
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package week9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thomas.kercheval
 */
public class Q41 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        Scanner in = new Scanner (System.in);
        System.out.print("Enter an integer! (press q to quit)... ");
        while (in.hasNextInt()) {
            System.out.print("Enter an integer! ");
            num1.add(in.nextInt());
        }
        int j = 0;
        int[] oddNum = new int[num1.size()];
        for (int i = 0; i < num1.size(); i++) {
            if (num1.get(i) % 2 != 0) {
                oddNum[j] = num1.get(i);
                j++;
            }
        }
        j = 0;
        for (int i = 0; i < num1.size(); i++) {
            System.out.println("Number: " + num1.get(i));
            if (num1.get(i) % 2 != 0) {
                System.out.println("This one is odd: " + oddNum[j]);
                j++;
            }
        }
    }
}
