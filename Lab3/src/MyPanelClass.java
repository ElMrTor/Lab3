import java.awt.Color;

import java.awt.Graphics;

import java.awt.Insets;

import javax.swing.JPanel;

 

public class MyPanelClass extends JPanel {





public void paintComponent(Graphics g) {

                        super.paintComponent(g);

 

                        //Compute interior coordinates

                        Insets myInsets = this.getInsets();

                        int x1 = myInsets.left;

                        int y1 = myInsets.top;

                        int x2 = getWidth() - myInsets.right - 1;

                        int y2 = getHeight() - myInsets.bottom - 1;

                        int width = x2 - x1;

                        int height = y2 - y1;

 

                        

                        g.setColor(Color.LIGHT_GRAY);

                        g.fillOval((width/2) - 27 , (height/2) - 27 , 55, 55);

                        

}

}