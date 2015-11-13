/*
 * Copyright (C) 2015 Thomas Kercheval
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

package cs141.resistancecalculator;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thomas.kercheval, josh.murphy
 */
public class Execution {
    public static void main(String[] args) {
        System.out.print("How many components will this circut have? ");
        // Prompts the user to enter the number of resistor components they 
        // desire
        Scanner in = new Scanner (System.in);
        // Scanner is initialized to receive user input
        int numOfCompons = in.nextInt();
        // Number of resistor components
        if (numOfCompons > 14) {
            // Upper and lower limmits are set for the number of components
            // If the number of components is below one or above 14 the program
            // exits
            System.out.println("We cannot have more than 14 components...");
            System.exit(0);
        } else if (numOfCompons < 1) {
            System.out.println("We must have at least one component...");
            System.exit(0);
        }
        int[] numRes = new int[numOfCompons];
        // Array is initialized to contain the number of resistors in each
        // component
        int maxNumRes = 0;
        for (int i = 0; i < numOfCompons; i++) {
            // Loop assigns a number of resistors to each entry of the numRes 
            // array with correspond to each components
            numRes[i] = determineNumRes(i);
            // A method determineNumRes which prompts the user for the number of
            // resistors they want in each component and takes their answer as
            // input
            if (numRes[i] > maxNumRes) {
                maxNumRes = numRes[i];
                // MaxNumRes is important because the component with the highest
                // number of resistors determines the width of the viewing frame
            }
        }
        Map<String, int[]> masterMap = createMap(numRes);
        // Hash map is initialized to store all resistance values for all 
        // components
        int xWidth = 400 + (maxNumRes * 20) + ((maxNumRes - 1) * 40);
        int yHeight = 200 + numOfCompons * 60;
        // Dimentions for the viewing frame are inialized based on the number of
        // resistors in the componet with the most resistors and the number of 
        // components
        ResistanceCalculator.main(xWidth, yHeight, masterMap);
    }
    
    /**
     * 
     * @param compNum
     * @return 
     */
    public static int determineNumRes(int compNum) {
        // Method is used to take input from the user regarding how many 
        // resistors they want in eacher component
        Scanner in = new Scanner (System.in);
        // Scanner is initialized to receive user input
        int compPos = compNum + 1;
        // The user is prompted the number of resistors in the component of its
        // index plus one because people usually don't think of the first item
        // in a list as item zero
        System.out.print("How many resisors are in component# "+compPos+"? ");
        // Prompts user to enter the number of resistors they want in the given
        // component
        int numRes = in.nextInt();
        // Assigns user input to int numRes
        if (numRes > 20) {
            // Upper and lower limmits are set for the number of resistors in 
            // each component. If the number of resistors is below one above
            // twenty the program exits.
            System.out.println("We cannot have more than 20 resistors...");
            System.exit(0);
        } else if (numRes < 1) {
            System.out.println("We must have at least one resistor...");
            System.exit(0);
        }
        return numRes;
        // The number of resistors for the given component is return in this 
        // method
    }
    
    /**
     * 
     * @param numRes
     * @return 
     */
    public static Map createMap(int[] numRes) {
        // Hash map is returned by this method which is a master map containing
        // all resistance values for all resistor components
        // This method will prompt the user for the resistance value for each
        // resistor
        Scanner in = new Scanner (System.in);
        // Scanner is initialized to receive user input
        Map<String, int[]> masterMap = new HashMap<>();
        for (int i = 0; i < numRes.length; i++) {
            // Outer loop repeats as many times as their are components
            String name = "comp" + i;
            // Each entry of the master map contains a string name and an int 
            // array containing resistance values
            int[] resistances = new int[numRes[i]];
            for (int j = 0; j < numRes[i]; j++) {
                // Inner loop iterates a number of times corresponding to
                //     the number of resistors in the component specified
                //     by the outerloop.
                // Loop assigns user inputted resistance values to entries in 
                //     each resistances int array which are stored as values
                //     in the masterMap hash map
                String question = "What is the resistance in Ohms of ";
                String request = "res# "+ (j+1) +" in comp# "+ (i+1) +"? ";
                // User is asked for the resistance of the resistor of its 
                // index plus one for the component of its index plus one
                // People don't usually think of the first item in a list as 
                // item zero
                // Prompt for resistance values assigned to variable then 
                // concatenated in order to shorten the line length of the print
                // statement
                System.out.print(question + request);
                int res = in.nextInt();
                if (res < 0) {
                    // Contrains are set for the resistance values. They must be
                    // Positive and lower than 10,000 Ohms or the program will 
                    // exit
                    System.out.println("We must have a positive resistance...");
                    System.exit(0);
                } else if (res > 10000) {
                    String high = "We must have resistance below 10,000 Ω...";
                    // Text regarding upper limit of resistance assigned to a 
                    // variable in order to shorten the line length of the 
                    // print statement
                    System.out.println(high);
                    System.exit(0);
                }
                resistances[j] = res;
                // Resistance values are set to entries in the resistances array
            }
            masterMap.put(name, resistances);
            // Hashmap contains a name for each component and an int array 
            // containing all individual resistance values for each component
        }
        return masterMap;
        // Hash map is returned by this method
    }
}
