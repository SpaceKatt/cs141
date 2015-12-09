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
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author Thomas
 */
public class MouseTester {
    public static void main(String[] args) {    
        JFrame frame = new Mous3();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MouseTester");
        frame.setVisible(true);
    }
}

class Mous3 extends JFrame {
    MouseListener listen;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    Mous3() {
        listen = new MouseListenerrr();
        
        addMouseListener(listen);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    class MouseListenerrr implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("MouseEneter");
            getContentPane().setBackground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("MouseExit");
            getContentPane().setBackground(Color.blue);
        }
        
    }
}