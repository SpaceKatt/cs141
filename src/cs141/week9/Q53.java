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
public class Q53 {
    public static void main(String[] args) {
        int cnt = 0;
        int[][] numarray = new int[2][3];
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j < 2; j++) { 
                numarray[j][i] = cnt;
                cnt++;
            }
        }
        System.out.println(numarray[1][2]);
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j < 2; j++) { 
                System.out.println(numarray[j][i]);
            }
        }
    }
}
