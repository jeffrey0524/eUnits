package Lab02;

import java.awt.*;
import javax.swing.*;

public class Panel02 extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.yellow);
		g.fillRect(50, 50, 160, 220);
		for(int i=40;i<220;i+=20) {
			for(int j=40;j<280;j+=20) {
				g.fillOval(i, j, 20, 20);
			}
		}
		ImageIcon thomas = new ImageIcon("src\\Lab02\\tj.jpg");
		g.drawImage(thomas.getImage(), 55, 55,150,210, null);
		g.setColor(Color.black);
		g.setFont(new Font("Serif",3,30));
		g.drawString("Our Fearless Leader",20,320);
	}
}
