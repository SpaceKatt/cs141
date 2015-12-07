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

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Q1point1 {
   /**
      Creates and displays the application frame.
   */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 1000);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1200, 1000));
        
        JPanel subpanel1 = new JPanel();
        subpanel1.setBackground(Color.RED);
        subpanel1.setPreferredSize(new Dimension(200, 950));
        JPanel subpanel2 = new JPanel();
        subpanel2.setBackground(Color.WHITE);
        subpanel2.setPreferredSize(new Dimension(200, 950));
        JPanel subpanel3 = new JPanel();
        subpanel3.setBackground(Color.GREEN);
        subpanel3.setPreferredSize(new Dimension(200, 950));
        JPanel subpanel4 = new JPanel();
        subpanel4.setBackground(Color.YELLOW);
        subpanel4.setPreferredSize(new Dimension(200, 950));
        JPanel subpanel5 = new JPanel();
        subpanel5.setBackground(Color.ORANGE);
        subpanel5.setPreferredSize(new Dimension(200, 950));
        
        panel.add(subpanel1);
        panel.add(subpanel2);
        panel.add(subpanel3);
        panel.add(subpanel4);
        panel.add(subpanel5);
        frame.add(panel);
        frame.setVisible(true);
    }
}

