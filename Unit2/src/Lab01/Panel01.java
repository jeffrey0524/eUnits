package Lab01;
import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel {
	public void paintComponent(Graphics g) {
		//空長方形g.drawRect(50, 50, 400, 75);
		//正方形g.fillRect(500, 50, 200, 200);
		//空橢圓g.drawOval(200, 200, 20, 80);
		//園 g.fillOval(500, 300, 100, 100);
		//點g.drawRect(400, 600, 1, 1);
		//線g.drawLine(20, 50, 120, 150);
		//垂線g.drawLine(150, 50, 150, 200);
		//橫線g.drawLine(250, 50, 350, 50);
		/*三角形
		  	int xPoints[] = {50, 150, 250};
			int yPoints[] = {250, 300, 250};
			g.drawPolygon(xPoints, yPoints, 3);
		 */
		/*三角線
		 * 	int xxPoints[] = {50, 150, 250};
			int yyPoints[] = {300, 350, 300};
			g.drawPolyline(xxPoints, yyPoints,3);
		 */
		g.setColor(Color.WHITE);
		g.drawString("Welcome Home",40,40);
		g.fillOval(300, 75, 50, 50);
		g.setColor(Color.black);
		g.drawLine(0, 350, 400, 350);
		g.drawRect(100, 200, 150, 150);
		g.fillRect(150, 275, 50, 75);
		int xPoints[] = {75, 175, 275};
		int yPoints[] = {200, 150, 200};
		g.drawPolygon(xPoints, yPoints, 3);
	}
}
