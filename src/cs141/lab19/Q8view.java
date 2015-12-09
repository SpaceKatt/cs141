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
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Thomas
 */
public class Q8view {
    public static void main(String[] args) {    
        JFrame frame = new Q8();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CruelViewer");
        frame.setVisible(true);
    }
}

class Q8 extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private static final int DEFAULT_SIZE = 20;
    
    private JRadioButton helloButton;
    private JRadioButton goodbyeButton;
    private JPanel southPanel;
    private JLabel label;
    private String message;
    private ButtonGroup group;
    private ActionListener listen;
    private JCheckBox cruel;
    
    public Q8() {
        listen = new MessageListener();
        createRadioButz();
        createSouthPanel();
        message = "Hello, ";
        label = createLabel();
        
        add(label, BorderLayout.CENTER);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private JLabel createLabel() {
        JLabel labz = new JLabel(message + "World");
        labz.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        return labz;
    }
    
    private void createRadioButz() {
        helloButton = new JRadioButton("Hello"); 
        goodbyeButton = new JRadioButton("Goodbye");
        cruel = new JCheckBox("Creul");
        cruel.addActionListener(listen);
        helloButton.addActionListener(listen);
        goodbyeButton.addActionListener(listen);
        group = new ButtonGroup();
        group.add(helloButton);
        group.add(goodbyeButton);
        helloButton.setSelected(true);
    }

    private void createSouthPanel() {
        southPanel = new JPanel();
        southPanel.add(helloButton);
        southPanel.add(goodbyeButton);
        southPanel.add(cruel);
        add(southPanel, BorderLayout.SOUTH);
    }
    
    class MessageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String message = ""; 
            if (helloButton.isSelected()) { 
                message = "Hello, "; 
            } else if (goodbyeButton.isSelected()) { 
                message = "Goodbye, "; 
            }
            if (cruel.isSelected()) {
                message += "Cruel";
            }
            message = message + " World!"; 
            label.setText(message); 
        } 
    } 
}
    
