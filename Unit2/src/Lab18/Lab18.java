package Lab18;

import java.awt.*;
import javax.swing.*;
public class Lab18 extends JPanel
{
	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		t.turnLeft(5);
		for(int k=0; k<4; k++)
		{
			t.forward(100);
			t.turnRight(90);
		}

		JFrame f = new JFrame();
		f.setSize(800,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Lab18());
		f.setVisible(true);
	}
	public void paintComponent(Graphics g)
	{
		g.drawImage(Turtle.getImage(),0,0,getWidth(),getHeight(),null);
	}
}
