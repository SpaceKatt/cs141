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
package cs141.lab19;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Thomas
 */
public class Q5point1  extends JFrame {   
    private String message;
    private JLabel label;
    private JButton smaller;
    private JButton larger;
    private JPanel southPanel;
   
    private static int FRAME_WIDTH = 300;
    private static int FRAME_HEIGHT = 300;
    private static int DEFAULT_SIZE = 20;

    public Q5point1() {
        message = "Hello, World!";
        label = new JLabel(message);
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);
        
        smaller = createSmaller();
        larger = createLarger();
        southPanel = createSouthPanel();
        
        add(southPanel, BorderLayout.SOUTH);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private JButton createSmaller() {
        JButton smallBut = new JButton("Smaller");
        
        return smallBut;
    }

    private JButton createLarger() {
        JButton largeBut = new JButton("Larger");
        
        return largeBut;
    }

    private JPanel createSouthPanel() {
        JPanel southern = new JPanel();
        southern.setLayout(new GridLayout(0,2));
        southern.add(smaller);
        southern.add(larger);
        return southern;
    }
}
