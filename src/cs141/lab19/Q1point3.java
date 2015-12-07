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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author thomas.kercheval
 */
public class Q1point3 {
    /**
      Creates and displays the application frame.
   */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 320);
        JPanel panel = new JPanel();
        JPanel pan3l = new JPanel();
        JPanel pan4l = new JPanel();
        JPanel pan5l = new JPanel();
        
        panel.setPreferredSize(new Dimension(1200, 1000));
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        GridLayout experimentLayout = new GridLayout(0,2);
        
        JPanel subpanel1 = new JPanel();
        subpanel1.setBackground(Color.RED);
        subpanel1.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel2 = new JPanel();
        subpanel2.setBackground(Color.WHITE);
        subpanel2.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel3 = new JPanel();
        subpanel3.setBackground(Color.GREEN);
        subpanel3.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel32 = new JPanel();
        subpanel32.setBackground(Color.BLUE);
        subpanel32.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel4 = new JPanel();
        subpanel4.setBackground(Color.YELLOW);
        subpanel4.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel5 = new JPanel();
        subpanel5.setBackground(Color.ORANGE);
        subpanel5.setPreferredSize(new Dimension(200, 200));
        
        pan4l.setLayout(experimentLayout);
        pan3l.add(subpanel1);
        pan3l.add(subpanel2);
        pan3l.setLayout(experimentLayout);
        pan3l.add(subpanel3);
        pan3l.add(subpanel32);
        pan5l.setLayout(experimentLayout);
        pan3l.add(subpanel4);
        pan3l.add(subpanel5);
        panel.setLayout(layout);
        
        panel.add(pan4l, BorderLayout.PAGE_START);
        //panel.add(subpanel2, BorderLayout.LINE_START);
        panel.add(pan3l, BorderLayout.CENTER);
        //panel.add(subpanel4, BorderLayout.LINE_END);
        panel.add(pan5l, BorderLayout.PAGE_END);
        frame.add(panel);
        frame.setVisible(true);
    }
}

