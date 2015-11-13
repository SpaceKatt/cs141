/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs141.lab6;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author thomas.kercheval
 */
public class Q15 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("You have drawn ");
        String cardName = Integer.toString(rand.nextInt(12));
        String cardType = Integer.toString(rand.nextInt(4));
        if (cardName.equals("0") ^ cardName.equals("7")) {
            System.out.print("an ");
        } else {
            System.out.print("a ");
        }
        Map<String, String> cardNames = new HashMap<>();
        Map<String, String> cardTypes = new HashMap<>();
        cardNames.put("0", "Ace");
        cardNames.put("1", "Two");
        cardNames.put("2", "Three");
        cardNames.put("3", "Four");
        cardNames.put("4", "Five");
        cardNames.put("5", "Six");
        cardNames.put("6", "Seven");
        cardNames.put("7", "Eight");
        cardNames.put("8", "Nine");
        cardNames.put("9", "Ten");
        cardNames.put("10", "Jack");
        cardNames.put("11", "Queen");
        cardNames.put("12", "King");
        cardTypes.put("0", "Diamonds");
        cardTypes.put("1", "Hearts");
        cardTypes.put("2", "Clubs");
        cardTypes.put("3", "Spades");
        System.out.println(cardNames.get(cardName) + " of " + 
                           cardTypes.get(cardType) + ".");
    }
}
