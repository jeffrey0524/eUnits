package Lab08;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

import Lab07.PolygonTurtle;
import Lab07.TurtlePanel;

   public class Driver08
   {
      public static void main(String[] args)
      {
    	  /**/
    	  JFrame frame = new JFrame("Flower Turtles");
          frame.setSize(400, 400);
          frame.setLocation(350, 200);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setContentPane(new TurtlePanel());
          frame.setVisible(true);
                    
    	  FlowerTurtle a = new FlowerTurtle();
    	  FlowerTurtle b = new FlowerTurtle(200,4,Color.white);
    	  
    	  b.drawShape();
    	  
    	  a.setSize(25.0);
    	  a.setColor(Color.yellow);
    	  a.drawShape();
    	  
    	  
    	  /**/
      }
   }