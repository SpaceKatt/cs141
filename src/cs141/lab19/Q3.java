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

/**
 *
 * @author Thomas
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Q3 {
   /**      Creates and displays the application frame.   */   
    public static void main(String[] args) {
        ColorFrame frame = new ColorFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class ColorFrame extends JFrame {
    private int[] color;
    private JMenuBar menu;
    
    public ColorFrame() {
        color = new int[]{0,0,0};
        menu = new JMenuBar();
        
        createMenu();
        
        setSize(800, 800);
    }
    
    private void createMenu() {
        setJMenuBar(menu);
        
        menu.add(createFileMenu());
        menu.add(createColorMenu());
    }
    
    class ExitItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        ActionListener listener = new ExitItemListener();
        exitItem.addActionListener(listener);
        fileMenu.add(exitItem);
        return fileMenu;
    }

    private JMenu createColorMenu() {
        JMenu col = new JMenu("Color");
        col.add(createColorItem("Red"));
        col.add(createColorItem("Green"));
        col.add(createColorItem("Blue"));
        return col;
    }

    private JMenuItem createColorItem(final String c) {
        class ColorItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (c) {
                    case "Red":
                        color[0] = 255;
                        color[1] = 0;
                        color[2] = 0;
                        break;
                    case "Green":
                        color[0] = 0;
                        color[1] = 255;
                        color[2] = 0;
                        break;
                    default:
                        color[0] = 0;
                        color[1] = 0;
                        color[2] = 255;
                        break;
                }
                setColor();
            }
        }
        
        JMenuItem item = new JMenuItem(c);
        ActionListener listener = new ColorItemListener();
        item.addActionListener(listener);
        return item;
    }
    
    private void setColor() {
        int red = color[0];
        int blue = color[2];
        int green = color[1];
        
        Color customColor = new Color(red, green, blue);
        getContentPane().setBackground(customColor);
    }
}

