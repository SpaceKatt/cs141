/*
 * Copyright (C) 2015 Josh Murphy
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

/**
 * @author josh.murphy
 * @date 10/27/15
 */
package cs141.resistancecalculator;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
/*
* @param xleft
* @param yTop
* @param resistance
*/
public class Resistor {
    private final double R; 
    // Creates a private variable for the resistance value
    private String ResistanceValueText; 
    // Creates a private variable to store the resistance value as a string
    private final int x; 
    // Creates a private variable for the x coordinate of the top left corner of
    // the resistor
    private final int y;
    // Creates a private variable for the y coordinate of the top left corner of
    // the resistor  
    public Resistor(int xleft, int ytop, double resistance) {
        R = resistance;
        x = xleft;
        y = ytop;
    }
    /*
    * Creates the visual image of the resistor and draws it in g2
    * 
    */
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(x + 10, y + 10, 20, 40); 
        // The main body of the resistor
        Line2D.Double lineTop = new Line2D.Double(x + 20, y + 10, x + 20, y); 
        // The wire comming off of the top of the resistor
        Line2D.Double lineBottom = new Line2D.Double(x + 20, y + 50, x + 20,
                                                     y + 60);
        // The wire comming of the bottom of the resistor
        ResistanceValueText = Double.toString(R); 
        // Converts the resistance value from a double to a string so it can be 
        // displayed on the image. Sores that string in ResistanceValueText
        g2.draw(body);
        g2.draw(lineTop);
        g2.draw(lineBottom);
        g2.drawString(ResistanceValueText + " Ω", x + 30, y + 30);
        // Draws the visual image of the resistor
    }
    /*
    *Retrived the double value of the resistor's resistance
    * @return
    */
    public double getResistance() {
    return R;
    }    
}
