/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
/**
 *
 * @author thomas.kercheval
 */
public class Q14 {
    public static void draw(Graphics g2) {
        int i = 0;
        int j = 0;
        int pos = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                //Ellipse2D.Double circle 
                //    = new Ellipse2D.Double(j * 40, i * 40, 40, 40);
                g2.drawOval(j * 40, i * 40, 40, 40);
            }
        }
      
   }

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JComponent component = new JComponent()
      {
         public void paintComponent(Graphics graph)
         {
            Graphics2D g2 = (Graphics2D) graph;
            draw(g2);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }

}
