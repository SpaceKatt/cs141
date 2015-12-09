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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Thomas
 */
public class Q7view {
    public static void main(String[] args) {
        JFrame frame = new Q7();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("COMBOViewer");
        frame.setVisible(true);
    }
}

class Q7 extends JFrame {    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private static final int DEFAULT_SIZE = 20;
    public static final int SMALL_SIZE = 12; 
    public static final int MEDIUM_SIZE = 18; 
    public static final int LARGE_SIZE = 24; 
    public static final int EXTRA_LARGE_SIZE = 56; 
    
    private JLabel label;
    private JPanel panel;
    private JComboBox<String> cBox;
    private ActionListener listener;
    
    public Q7() {
        listener = new ChoiceListener();
        label = createLabel();
        cBox = createComboBoxer();
        panel = createPanel();
        
        add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private JLabel createLabel() {
        JLabel labz = new JLabel("SpaceKatt!");
        labz.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        return labz;
    }

    private JComboBox createComboBoxer() {
        JComboBox<String> boxy = new JComboBox<>();
        boxy.addItem("Small");
        boxy.addItem("Medium");
        boxy.addItem("Large");
        boxy.addItem("XXXXL");
        boxy.addActionListener(listener);
        return boxy;
    }

    private JPanel createPanel() {
        JPanel pan3l = new JPanel();
        pan3l.add(cBox);
        return pan3l;
    }
    
    class ChoiceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setFontHere();
        }

        private void setFontHere() {
            int messageSize = DEFAULT_SIZE;
            String item = (String) cBox.getSelectedItem();
            if (item.equals("Small")) { 
                messageSize = SMALL_SIZE; 
            } else if (item.equals("Medium")) { 
                messageSize = MEDIUM_SIZE; 
            } else if (item.equals("Large")) { 
                messageSize = LARGE_SIZE; 
            } else if (item.equals("XXXXL")) { 
                messageSize = EXTRA_LARGE_SIZE; 
            }
            label.setFont(new Font("Serif", Font.PLAIN, messageSize));
            label.repaint();
        }
    }
}
