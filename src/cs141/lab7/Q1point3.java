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
public class Q1point3 {
    public static void main(String[] args) {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Before rotation:  ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]:  " + x[i]);
        }
        double[] y = rotate(x, 14);
        System.out.println("After rotation:  ==============================");       
        for (int i = 0; i < y.length; i++) {
            System.out.println("y[" + i + "]:  " + y[i]);
        }
    }

    private static double[] rotate(double[] x, int i) { 
        double[] y = new double[x.length];
        for (int j = 0; j < x.length; j++) {
            y[(j+i) % x.length] = x[j];
        }
        return y;
    }
}
