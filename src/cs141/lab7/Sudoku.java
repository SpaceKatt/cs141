/*
 * Copyright (C) 2015 Thomas
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
 * @author Thomas
 */
public class Sudoku {
    public static void main(String[] args) {
        // Row and column Latin but with invalid subsquares
        String config1 = "1234567892345678913456789124567891235678912346" 
            + "78912345789123456891234567912345678";
        String[][] puzzle1 = makeSudoku(config1);
        if (isValidSudoku(puzzle1)) {
            System.out.println("This puzzle is valid.");
        } else {
            System.out.println("This puzzle is invalid.");
        }
        System.out.println(getPrintableSudoku(puzzle1));
        System.out.println("--------------------------------------------------");

        // Row Latin but column not Latin and with invalid subsquares
        String config2 = "12345678912345678912345678912345678912345678"
            + "9123456789123456789123456789123456789";
        String[][] puzzle2 = makeSudoku(config2);
        if (isValidSudoku(puzzle2)) {
            System.out.println("This puzzle is valid.");
        } else {
            System.out.println("This puzzle is invalid.");
        } 
       
        System.out.println(getPrintableSudoku(puzzle2));
        System.out.println("--------------------------------------------------"); 
       
        // A valid sudoku
        String config3 = "25813764914698532779324685147286319558149273663"
            + "9571482315728964824619573967354218";
        String[][] puzzle3 = makeSudoku(config3);
        if (isValidSudoku(puzzle3)) {
            System.out.println("This puzzle is valid.");
        } else {
            System.out.println("This puzzle is invalid.");
        } 
        System.out.println(getPrintableSudoku(puzzle3));
        System.out.println("--------------------------------------------------"); 

    }
   
    public static String[][] makeSudoku(String s) {
        int SIZE = 9;
        int k = 0;
        String[][] x = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x[i][j] = s.substring(k, k + 1);
                k++;
            }
        }
        return x;
    }

    public static String getPrintableSudoku(String[][] x) {
        int SIZE = 9;
        String temp = "";
        for (int i = 0; i < SIZE; i++) {
            if ((i == 3) || (i == 6)) {
                temp = temp + "=================\n";
            }
            for (int j = 0; j < SIZE; j++) {
                if ((j == 3) || (j == 6)) {
                    temp = temp + " || ";
                }
            temp = temp + x[i][j];
            }
            temp = temp + "\n";
        }
        return temp;
    }

    public static boolean isValidSudoku(String[][] x) {
        return rowsAreLatin(x) && colsAreLatin(x) && goodSubsquares(x);
    }

    public static boolean rowsAreLatin(String[][] x) {
      // fill in your code here
    }

    public static boolean rowIsLatin(String[][] x, int i) {
      // fill in your code here
    }

    public static boolean colsAreLatin(String[][] x) {
      // fill in your code here
    }   

    public static boolean colIsLatin(String[][] x, int j) {
      // fill in your code here
    }
   
    public static boolean goodSubsquares(String[][] x) {
      // fill in your code here
    }

    public static boolean goodSubsquare(String[][] x, int i, int j) {
      // fill in your code here
    }
}