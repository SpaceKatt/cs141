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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Thomas
 */
public class Q6view {
    public static void main(String[] args) {
        JFrame frame = new Q6();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MenuViewer");
        frame.setVisible(true);
    }
}
    
class Q6 extends JFrame {

    private JLabel label;
    private JMenuBar bar;
    private JMenu menuFont;
    private JMenuItem smaller;
    private JMenuItem larger;
    private double fontFactor;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private static final int DEFAULT_SIZE = 20;
    
    public Q6() {
        label = createLabel();
        bar = new JMenuBar();
        menuFont = createMenuFont();
        smaller = createSmaller();
        larger = createLarger();
        fontFactor = 1;
        addMenuComps();
        
        add(label, BorderLayout.CENTER);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private JMenuItem createSmaller() {
        JMenuItem small = new JMenuItem("Smaller!");
        ActionListener smallListener = new smallListen();
        small.addActionListener(smallListener);
        return small;
    }

    private JMenuItem createLarger() {
        JMenuItem large = new JMenuItem("Largererer!");
        ActionListener largeListener = new largeListen();
        large.addActionListener(largeListener);
        return large;
    }

    private void addMenuComps() {
        setJMenuBar(bar);
        menuFont.add(smaller);
        menuFont.add(larger);
        bar.add(menuFont);
    }

    private JMenu createMenuFont() {
        JMenu menu = new JMenu("FontStuff!");
        
        return menu;
    }

    private JLabel createLabel() {
        JLabel labz = new JLabel("SpaceKatt!");
        labz.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        return labz;
    }

    class largeListen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fontFactor *= 1.25;
            label.setFont(new Font("Serif", Font.PLAIN,
                  (int) (DEFAULT_SIZE * fontFactor)));
            repaint();
        }
    }
    
    class smallListen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fontFactor *= .75;
            label.setFont(new Font("Serif", Font.PLAIN,
                  (int) (DEFAULT_SIZE * fontFactor)));
            repaint();
        }
    }
}


