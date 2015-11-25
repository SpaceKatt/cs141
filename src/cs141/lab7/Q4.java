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

package cs141.lab7;

import java.util.Scanner;

/**
 *
 * @author thomas.kercheval
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("How many random numbers should we generate? ");
        int randNum = in.nextInt();
        System.out.print("What is the number of values for each draw? ");
        int randRange = in.nextInt();
        int[] randz = new int[randRange];
        for (int i = 0; i < randNum; i++) {
            int num = (int) (Math.random() * randRange);
            randz[num]++;
        }
        for (int i = 0; i < randz.length; i++) {
            System.out.println(i + "  " + randz[i]);
        }
    }
}
