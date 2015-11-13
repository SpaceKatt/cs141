/*
 * Copyright (C) 2015 Josh Murphy, Thomas Kercheval
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
 * @date 10/28/15
 */
package cs141.resistancecalculator;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class ResComp {
    private final int width;
    private final int yTop;
    private final int numRes;
    private int gap;
    /* int variables initialized for the width of the frame the y coordinate of
     * the top of the given component, the number of resistors in the given
     * component and the size of the gap between the wire connecting the 
     * resistors in the given component and the edge of the frame.
     */
    
    /**
     * 
     * @param totalWidth
     * @param yPos
     * @param numberOfRes 
     */
    public ResComp(int totalWidth, int yPos, int numberOfRes) {
        width = totalWidth;
        yTop = yPos;
        numRes = numberOfRes;
    }

    public void draw(Graphics2D g2) {
        // Drawing instructions for the wires connecting resistors
        int lineLength = (((numRes - 1) * 40) + (numRes * 20)) - 20;
        // Wire length determined based on the number of resistors in that 
        // component
        this.gap = ((width -lineLength)/2);
        // Size of the gap between the wires and the edge of the frame 
        // determined based on the length of the wires and the width of the 
        // frame
        Line2D.Double lineTop = new Line2D.Double(gap, yTop, width - gap, yTop);
        Line2D.Double lineBottom = new Line2D.Double(gap, yTop + 60, 
                                                     width - gap, yTop + 60);
        // Lines created for the wires at the top and bottom of each component
        // of resistors
        g2.draw(lineTop);
        g2.draw(lineBottom);
        // Wires connecting resistors drawn on the frame
    }
    
    /**
     * 
     * @return 
     */
    public int returnGap() {
        return this.gap;
        // Method returns the size of the gap between the wires connecting the 
        // resistors and the edge of the frame
    }
}
