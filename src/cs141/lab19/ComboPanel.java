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
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Goes with Q2.
 * @author Thomas
 */
public class ComboPanel extends JPanel {
    
    private ActionListener listener;
    private JComboBox<Integer> third;
    private JComboBox<Integer> second;
    private JComboBox<Integer> first;
    
    public ComboPanel() {
        listener = new ChoiceListener();
        
        createControls();
        
        setSize(800, 800);
    }
    
    class ChoiceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setColor();
        }
    }
    
    public void createControls() {
        first = new JComboBox<>();
        second = new JComboBox<>();
        third = new JComboBox<>();
        
        int numbersToAdd = 256;
        for (int i = 0; i < numbersToAdd; i++) {
            first.addItem(i);
            second.addItem(i);
            third.addItem(i);
        }
        first.addActionListener(listener);
        second.addActionListener(listener);
        third.addActionListener(listener);
        
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        controls.add(first);
        controls.add(second);
        controls.add(third);
        
        add(controls, BorderLayout.SOUTH);
    }
    
    public void setColor() {
        int red = (int) first.getSelectedItem();
        int blue = (int) second.getSelectedItem();
        int green = (int) third.getSelectedItem();
        
        Color customColor = new Color(red, green, blue);
        setBackground(customColor);
        
    }
}
