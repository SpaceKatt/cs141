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

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
/**
 *
 * @author thomas.kercheval, josh.murphy
 */

public class Group {
    private final int xPos;
    private final int totalY;
    // Integer values initialized to contain the information needed to draw 
    // wires at the end of the circuit set up at the right coordinates
    
    /**
     * 
     * @param FRAME_WIDTH
     * @param FRAME_HEIGHT 
     */
    public Group(int FRAME_WIDTH, int FRAME_HEIGHT) {
        xPos = FRAME_WIDTH / 2;
        totalY = FRAME_HEIGHT;
        // The xPos and totalY values depend on the viewing frame size
    }
    
    /**
     * 
     * @param g2 
     */
    public void draw(Graphics2D g2) {
        
        Line2D.Double lineTop = new Line2D.Double(xPos, 25, xPos, 50);
        Line2D.Double lineBottom = new Line2D.Double(xPos, totalY - 150, 
                                                     xPos, totalY - 120);
        // Lines are intialized to extend from the top and bottom resistor 
        // components based on the size of the viewing frame
        Ellipse2D.Double topBlob
                = new Ellipse2D.Double(xPos - 5, 15, 10, 10);
        Ellipse2D.Double bottomBlob
                = new Ellipse2D.Double(xPos - 5, totalY - 120, 10, 10);
        // Circles are initized indicating the two end points of the full 
        // circuit set up
        g2.draw(lineTop);
        g2.draw(lineBottom);
        g2.draw(topBlob);
        g2.draw(bottomBlob);
        // Lines are circles are drawn a the two end point of the circuit set up
        
    }
}
