package Lab06;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
/*         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();*/
      
         /************************/
         SquareTurtle smidge = new SquareTurtle();
         SquareTurtle smidge2 = new SquareTurtle();
         SquareTurtle smidge3 = new SquareTurtle(500, 200,135);
         SquareTurtle smidge4 = new SquareTurtle(100, 200, 315);
         
         smidge.setColor(Color.BLACK);
         smidge.setSize(40);
         smidge.drawShape();
         
         smidge2.setColor(Color.BLUE);
         smidge.setSize(50);
         smidge2.drawShape();
         
         smidge3.setColor(Color.RED);
         smidge3.drawShape();
         smidge3.setSize(40);
         smidge3.drawShape();
         smidge3.setSize(30);
         smidge3.drawShape();
         smidge3.setSize(20);
         smidge3.drawShape();
         smidge3.setSize(10);
         smidge3.drawShape();
         
         smidge4.setSize(20);
         smidge4.drawShape();
      	/************************/
      
      }
   }