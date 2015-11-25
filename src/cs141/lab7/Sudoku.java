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
        System.out.println("-----------------------------------------------");

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
        System.out.println("-----------------------------------------------");
       
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
        System.out.println("-----------------------------------------------");

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
        String temp = "\n";
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
        boolean goodRows = rowsAreLatin(x);
        boolean goodCols = colsAreLatin(x);
        boolean dontWantToPrint = goodSubsquares(x);
        System.out.println("valid rows " + goodRows);
        System.out.println("valid cols " + goodCols);
        System.out.println("valid sqrurs " + dontWantToPrint);
        return goodRows && goodCols && dontWantToPrint;
    }

    public static boolean rowsAreLatin(String[][] x) {
        System.out.println("Time to determine rows...");
        boolean result = true;
        int numRows = x.length;
        for (int i = 0; i < numRows; i++) {
            result = result && rowIsLatin(x, i);
        } 
        return result;
    }

    public static boolean rowIsLatin(String[][] x, int i) {
        boolean result = true;
        String[] rowI = x[i];
        String[] compare = new String[x.length];
        compare[0] = rowI[0];
        for (int j = 1; j < rowI.length; j++) {
            System.out.print("\nCompare");
            for (int k = 0; k < j; k++) {
                System.out.print(" :: " + rowI[j] + " vs " + compare[k]);
                if (rowI[j].equals(compare[k])) {
                    result = false;
                    System.out.print(" <!fail!>");
                }
            }
            compare[j] = rowI[j];
        }
        return result;
    }

    public static boolean colsAreLatin(String[][] x) {
        System.out.println("\n\nTime to determine columns...");
        boolean result = true;
        int numCols = x[0].length;
        for (int i = 0; i < numCols; i++) {
            boolean thing = colIsLatin(x, i);
            result = result && thing;
        } 
        return result;
    }   

    public static boolean colIsLatin(String[][] x, int j) {
        boolean result = true;
        String[] colI = grabColumn(x, j);
        String[] compare = new String[x.length];
        compare[0] = colI[0];
        for (int m = 1; m < colI.length; m++) {
            System.out.print("\nCompare");
            for (int k = 0; k < m; k++) {
                System.out.print(" :: " + colI[m] + " vs " + compare[k]);
                if (colI[m].equals(compare[k])) {
                    result = false;
                    System.out.print(" <!fail!>");
                }
            }
            compare[m] = colI[m];
        }
        return result;
    }
   
    public static boolean goodSubsquares(String[][] x) {
        System.out.println("\n\nTime to determine squares...");
        boolean result = true;
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean thing = goodSubsquare(x, i, j);
                result = result && thing;
            }
        }
        System.out.println("\n");
        return result;
    }

    public static boolean goodSubsquare(String[][] x, int i, int j) {
        int rowNum = i;
        int colNum = j;
        boolean result = true;
        String[] compare = new String[x.length * x[0].length];
        compare[0] = x[i][j];
        int compareIndex = 1;
        for (i = rowNum; i < rowNum+3; i++) {
            for (j = colNum; j < colNum+3; j++) {
                System.out.print("\ni= " + i + ", j= " +j + ", compare");
                for (int k = 0; k < compareIndex; k++) {
                    System.out.print(" :: " + x[i][j] + " vs " + compare[k]);
                    if (compareIndex == 1) { // Skip comparison
                    } else if (x[i][j].equals(compare[k])) {
                        result = false;
                        System.out.print(" <!fail!>");
                    }
                }
                compare[compareIndex] = x[i][j];
                compareIndex++;
            }
        }
        return result;
    }

    private static String[] grabColumn(String[][] x, int i) {
        String[] ray = new String[x.length];
        for (int j = 0; j < ray.length; j++) {
            ray[j] = x[j][i];
        }
        return ray;
    }
}