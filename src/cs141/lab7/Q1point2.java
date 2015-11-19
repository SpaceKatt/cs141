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

/**
 *
 * @author thomas.kercheval
 */
public class Q1point2 {
    public static void main(String[] args) {
        int[] arz = new int[]
                {8, 4, 5, 21, 7, 9, 18, 2, 100};
        printTotalEnhanced(arz);
        printTotalStandard(arz);
        printMinimumValue(arz);
        printMinimumValueIndex(arz);
        
    }
    
    public static void printTotalEnhanced(int[] numz) {
        int total = 0;
        for (int e : numz) {
            total += e;
        }
        System.out.println("The total is: " + total);
    }

    private static void printTotalStandard(int[] arz) {
        int total = 0;
        for (int i = 0; i < arz.length; i++) {
            total += arz[i];
        }
        System.out.println("The total is: " + total);
    }

    private static void printMinimumValue(int[] arz) {
        int min = arz[0];
        for (int e : arz) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("The minimum value: " + min);
    }

    private static void printMinimumValueIndex(int[] arz) {
        int min = arz[0];
        int index = 0;
        for (int i = 0; i < arz.length; i++) {
            if (arz[i] < min) {
                min = arz[i];
                index = i;
            }
        }
        System.out.print("The index of the minimum value: " + index);
        System.out.println(" ...The minimum value: " + min);
    }
}
