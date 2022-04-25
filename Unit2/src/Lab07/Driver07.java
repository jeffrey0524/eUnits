package Lab07;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      /*
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
      */
         /************************/
         PolygonTurtle a = new PolygonTurtle();
         PolygonTurtle b = new PolygonTurtle(100.0, 3);
         PolygonTurtle c = new PolygonTurtle(500.0,500.0,45,100.0, 4);

         a.setColor(Color.BLACK);
         a.setThickness(4);
         a.drawShape();
         
         b.setColor(Color.blue);
         b.setThickness(10);
         b.setSize(100.0);
         b.drawShape();
         b.setSides(5);
         b.drawShape();
         
         c.setColor(Color.gray);
         b.setThickness(5);
         c.setSize(80.0);
         for(int i=4;i<=10;i+=2) {
        	 c.setSides(i);
        	 c.drawShape();
         }
         
      	/************************/
      
      }
   }