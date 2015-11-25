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

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        printList(names);
        addNames(names);
        printList(names);
        System.out.println("First: " + names.get(0) + 
                           " Last: " + names.get(names.size()-1));
        System.out.println("Size: " + names.size());
        
        names.set(0, "Alice B. Toklas");
        printList(names);
        
        names.add(4, "Doug");
        printList(names);
        
        printEnhanced(names);
        
        ArrayList<String> names2 = new ArrayList<String>(names);
        names.remove(0);
        printList(names);
        printList(names2);
    }
    
    public static void printList(ArrayList<String> names) {
        System.out.println(names);
    }

    private static void addNames(ArrayList<String> names) {
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        
    }

    private static void printEnhanced(ArrayList<String> names) {
        for (String e : names) {
            System.out.println(e);
        }
    }
}
