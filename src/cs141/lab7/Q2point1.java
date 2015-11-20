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

import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class Q2point1 {
    public static void main(String[] args) {
        String[] names = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
        CustomerLister customsLister = new CustomerLister(names);
        System.out.println("Using a standard for loop to print names...");
        customsLister.standardFor();
        System.out.println("Using an enhanced for loop to print names...");
        customsLister.enhancedFor();
        customsLister.gatherBalance();
    }
}

class CustomerLister {
    private final String[] customerList;
    private double[] customerBal;
    
    CustomerLister(String[] names) {
        this.customerList = names;
    }
    
    void standardFor() {
        for (int i = 0; i < this.customerList.length; i++) {
            System.out.println(this.customerList[i]);
        }
    }

    void enhancedFor() {
        for (String customer : this.customerList) {
            System.out.println(customer);
        }
    }

    void gatherBalance() {
        System.out.println("Use these balances: 100.00, 234.56, "
                                           +"2.49, 32.32, 400.00");
        Scanner in = new Scanner (System.in);
        int numOfElements = this.customerList.length;
        customerBal = new double[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            System.out.print("Enter bal for " + this.customerList[i] + ": ");
            customerBal[i] = in.nextDouble();
        }
        System.out.println("\nNow that we have all the balances...");
        for (int i = 0; i < numOfElements; i++) {
            System.out.print(this.customerList[i] + "'s balance = ");
            System.out.println(this.customerBal[i]);
        }
    }
}