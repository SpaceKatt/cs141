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
public class Q1 {
    public static void main(String[] args) {
        int[] arz = new int[]
                {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println(arz.length);
        System.out.println("First: " + arz[0] + " Last: " + arz[arz.length-1]);
        for (int i = 0; i < arz.length; i++) {
            System.out.println(arz[i]);
        }
        for (int i = arz.length - 1; i >= 0; i--) {
            System.out.println("Element: " + i + " is: " + arz[i]);
        }
        int j = 0 ;
        for (int e : arz) {
            System.out.println("Element: " + j + " is: " + e);
            j++;
        }
    }
}
