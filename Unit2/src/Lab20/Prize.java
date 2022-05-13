package Lab20;

import java.awt.Color;

public class Prize extends Spot{

	public Prize() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prize(double x, double y, double d, Color c) {
		super(x, y, d, c);
		// TODO Auto-generated constructor stub
	}

	public void lightup() {
		setColor(Color.yellow);
	}
}
