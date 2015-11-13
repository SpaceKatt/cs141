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

import javax.swing.JFrame;
import java.util.Map;

/**
 *
 * @author josh.murphy
 */
public class ResistanceCalculator {
    /**
     * 
     * @param xWidth
     * @param yHeight
     * @param masterMap 
     */
    public static void main(int xWidth, int yHeight, Map masterMap) {
        final int FRAME_WIDTH = xWidth;
        final int FRAME_HEIGHT = yHeight;
        
        JFrame frame = new JFrame();

        PaintComponent comp = new PaintComponent(masterMap, FRAME_WIDTH,
                                                 FRAME_HEIGHT);
        // For dimentions of the frame
        // Create new Print Component for the frame
        // Sets frame to the given dimentions and gives it a title
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Resistor Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comp);
        // Adds the Paint Component to the frame
        frame.setVisible(true);
    }
}
