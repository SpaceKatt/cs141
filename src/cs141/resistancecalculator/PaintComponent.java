/*
 * Copyright (C) 2015 Thomas Kercheval, Josh Murphy
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

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Map;
import javax.swing.JComponent;
/**
 *
 * @author thomas.kercheval, josh.murphy
 */
public class PaintComponent extends JComponent {
    /* Connects my PaintComponent class to JComponent */
    
    private final Map map;
    private final int FRAME_WIDTH;
    private final int FRAME_HEIGHT;
    
    /**
     * 
     * @param masterMap
     * @param xWidth
     * @param yHeight 
     */
    public PaintComponent(Map masterMap, int xWidth, int yHeight) {
        this.map = masterMap; // This is an array of resistance values
        this.FRAME_WIDTH = xWidth;
        this.FRAME_HEIGHT = yHeight;
    }

    /**
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        // Creates new resistors based on their coordinates
        Graphics2D g2 = (Graphics2D) g;
        // Graphics2D is called to display graphics on the frame
        Group group = new Group(FRAME_WIDTH, FRAME_HEIGHT);
        // Group class object is created based on the frame dimentions
        group.draw(g2);
        // Group object is drawn
        double totalResistance = 0;
        // A double variable for the totalResistance of the circuit set up is
        // initialized
        int yPos = 50;
        // The y corridinate for the top of the first componet is set to 50
        for (int i =0; i < map.size(); i++) {
            // The loop repeats once for each component
            String name = "comp" + i;
            // The name of the component depends on the counter i in this loop
            int[] resArray = (int[]) map.get(name);
            //// In the line above we get the value associated with the key
            ////     `name` out of the HashMap `map`. Since we stored object
            ////     references as values in our map, we have to cast them
            ////     as int[] before we can start pulling elements out of our
            ////     array (elements that represent resistor values).
            ResComp resComp = new ResComp(FRAME_WIDTH, yPos, resArray.length);
            resComp.draw(g2);
            totalResistance += paraCalc(resArray); // Adds up total resistance
            int xPos = resComp.returnGap() - 20;
            for (int j = 0; j < resArray.length; j++) {
                Resistor res = new Resistor(xPos, yPos, resArray[j]);
                xPos += 60; // Every resistor starts 60 away from the last.
                res.draw(g2); // Draws each resistor constructed by loop.
            }
            yPos += 60;
        }
        Rectangle totalResistanceBox = new Rectangle(FRAME_WIDTH - 200, 
                                                     FRAME_HEIGHT - 100, 
                                                     170, 50);
        // A rectangle is created to put a box around the total resistance value
        // displayed on the frame
        g2.draw(totalResistanceBox);
        // The rectangle containing the total resistance value is drawn
        g2.drawString("The total resistance is:", 
                      FRAME_WIDTH - 190, FRAME_HEIGHT - 80);
        g2.drawString(totalResistance + " Ω", 
                      FRAME_WIDTH - 190, FRAME_HEIGHT - 65);
        // String are drawn on the frame's lower right corner displaying the 
        // total resistance of the circuit set up
        }
    
    /**
     * 
     * @param resArray
     * @return 
     */
    public double paraCalc(int[] resArray){
        // Paracalc computes the resistance of each component containing 
        // resistors in parallel based on Ohm's law
        double calc = 0;
        for (int i = 0; i < resArray.length; i++) {
            double oneReciprocal = Math.pow(resArray[i], -1);
            calc += oneReciprocal;
        }
        return Math.pow(calc, -1);
        // Method return the resistance of a given component(level) of resistors
    }
}