package Lab09;

import java.awt.Color;

import javax.swing.JFrame;

import Lab07.PolygonTurtle;
import Lab07.TurtlePanel;

public class Driver09 {

	public static void main(String[] args) {
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
        TwistyTurtles a = new TwistyTurtles();
        TwistyTurtles2 b = new TwistyTurtles2();
        TwistyTurtles3 c = new TwistyTurtles3();

        a.setColor(Color.BLACK);
        a.setThickness(3);
        a.drawShape();
        
        b.setColor(Color.blue);
        b.setThickness(5);
        b.drawShape();
        
        c.setColor(Color.red);
        b.setThickness(10);
       	 c.drawShape();
        
        
     	/************************/
	}

}
