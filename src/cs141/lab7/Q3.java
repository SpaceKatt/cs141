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
public class Q3 {
    public static void main(String[] args) {
        boolean[] door;
        final int NODOORS = 101;    // We will not use door[0]
        final boolean OPEN = true;
        final boolean CLOSED = false;
        // Initialize the doors
        door = new boolean[NODOORS];
        for (int i = 0;  i < NODOORS; i++) {
            door[i] = CLOSED;
        }
        // Print the state of each door (only doors 1-100)
        printDoors(door);
        int j = 0;
        for (int i = 1; i < door.length; i++) {
            for (j = i; j < door.length; j += i) {
                door[j] = flipBit(door[j]);
            } 
        }
        printDoors(door);
    }
    
    public static void printDoors(boolean[] doors) {
        for (int i = 1; i < doors.length; i++) {
            if (doors[i] == true) {
                System.out.println("Door " + i + " is open.");
            } else {
                System.out.println("Door " + i + " is closed.");
            }
        }
        System.out.print("\n\n");
    }
    
    public static boolean flipBit(boolean b) {
        return !b;
    }
}

