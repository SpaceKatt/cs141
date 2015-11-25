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

/**
 *
 * @author thomas.kercheval
 */
public class FlippArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] arrayFlipped = flipArray(array);
        for (int e : arrayFlipped) {
            System.out.println(e);
        }
    }
    
    private static int[] flipArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < (array.length/2); i++) {
            newArray[i] = array[i + (array.length/2)];
        }
        for (int i = 0; i < (array.length/2); i++) {
            newArray[i + (array.length/2)] = array[i];
        }
        return newArray;
    }
}
