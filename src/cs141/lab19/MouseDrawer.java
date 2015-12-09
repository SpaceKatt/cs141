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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Thomas
 */
public class MouseDrawer {
    public static void main(String[] args) {    
        JFrame frame = new Mous3z();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MouseTester");
        frame.setVisible(true);
    }
}

class Mous3z extends JFrame {
    MouseListener listen;
    private Point2D p;
    private LineComponent thing;
    
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    Mous3z() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        listen = new MouseListenerrr();
        p = new Point2D.Double(50,100);
        thing = new LineComponent(p);
        
        addMouseListener(listen);
        
        add(thing);
        repaint();
    }
    
    class MouseListenerrr implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int xPos = e.getX();
            int yPos = e.getY();
            p = new Point2D.Double(xPos, yPos);
            thing.setSize(getWidth(), getHeight());
            thing.p = p;
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int xPos = e.getX();
            int yPos = e.getY();
            Point2D point = new Point2D.Double(xPos, yPos);
            thing.setSize(getWidth(), getHeight());
            thing.p = point;
            revalidate();
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            System.out.println("MouseEneter");
//            getContentPane().setBackground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            System.out.println("MouseExit");
//            getContentPane().setBackground(Color.blue);
        }
        
    }
}

class LineComponent extends JPanel {
    Point2D one;
    Point2D two;
    Point2D three;
    Point2D p;
    Point2D zero;
    private final Line2D.Double lineOne;
    private final Line2D.Double lineTwo;
    private final Line2D.Double lineThree;
    private final Line2D.Double lineFour;
    
    public LineComponent(Point2D p) {
        setSize(300, 300);
        this.one = new Point2D.Double(getWidth(), getHeight());
        this.two = new Point2D.Double(0, getHeight());
        this.three = new Point2D.Double(getWidth(), 0);
        this.p = p;
        this.zero = new Point2D.Double(0,0);
        this.lineOne = new Line2D.Double(one, this.p);
        this.lineTwo = new Line2D.Double(two, this.p);
        this.lineThree = new Line2D.Double(three, this.p);
        this.lineFour = new Line2D.Double(zero, this.p);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        this.one = new Point2D.Double(getWidth(), getHeight());
        this.two = new Point2D.Double(0, getHeight());
        this.three = new Point2D.Double(getWidth(), 0);
        
        super.paintComponent(g);
        setPreferredSize(new Dimension(getWidth(), getHeight()));
        Graphics2D g2 = (Graphics2D) g;
        lineOne.setLine(one, p);
        lineTwo.setLine(two, p);
        lineThree.setLine(three, p);
        lineFour.setLine(zero, p);
        g2.draw(lineOne);
        g2.draw(lineTwo);
        g2.draw(lineFour);
        g2.draw(lineThree);
    }
}