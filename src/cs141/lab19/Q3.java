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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


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
    
    JMenuBar menu;
    
    public ColorFrame() {
        menu = new JMenuBar();
        setJMenuBar(menu);
    }
    
    private void createMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenu color = new JMenu("Color");
        
        menu.add(fileMenu);
        menu.add(color);
    }
}

