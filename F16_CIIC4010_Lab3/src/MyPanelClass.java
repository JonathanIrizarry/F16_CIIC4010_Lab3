import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        
                        //Sets the red rectangles
                        g.setColor(Color.RED);
                        g.fillRect(x1+10, y1+30, 200, 20);
                        g.fillRect(x1+10, y1+70, 200, 20);
                        g.fillRect(x1+10, y1+110, 200, 20);
                        
                        //Sets the white rectangles
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, y1+50, 200, 20);
                        g.fillRect(x1+10, y1+90, 200, 20);  
                        
                        //Sets the blue triangle
                        Polygon p1 = new Polygon();
                        p1.addPoint(x1 + 10, y1 + 30);
                        p1.addPoint(x1 + 115, y1 + 80);
                        p1.addPoint(x1 + 10, y1 + 130);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p1);                                                
                      
                        //Sets the white star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
			}
}