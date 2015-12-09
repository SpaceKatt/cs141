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

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Thomas
 */
public class Q4 {
    public static void main(String[] args) {
        int[] meh = {1,2,3,4,5,6,7,8,9,0};
        JLister jListah = new JLister(meh);
        jListah.runIt();
    }
}

class JLister {
    
    private JFrame mainFrame;
    private JPanel controls;
    private final JList<Integer> theList;
    
    JLister(int[] stuff) {
        Integer intStuff[] = new Integer[stuff.length];
        for (int i = 0; i < stuff.length; i++) {
            intStuff[i] = stuff[i];
        }
        theList = new JList<>(intStuff);
    }
    
    public void runIt() {
        mainFrame = new JFrame("JLister, yo...");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 500);
        
        controls = createControlPanel();
        mainFrame.add(controls);
        mainFrame.setVisible(true);
    }

    private JPanel createControlPanel() {
        JPanel control = new JPanel();
        
        theList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        theList.setVisibleRowCount(5);
        
        JScrollPane scroller = new JScrollPane(theList);
        
        control.add(scroller);
        return control;
    }
}