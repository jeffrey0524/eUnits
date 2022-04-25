package Lab09;

import edu.fcps.Turtle;

public class TwistyTurtles2 extends Turtle {
	
	public TwistyTurtles2() {
		super();
	}
	 
	public void drawShape() {
		for(int i=0;i<=150;i+=2) {
			forward(i);
			turnLeft(30);
		}
	}

}
