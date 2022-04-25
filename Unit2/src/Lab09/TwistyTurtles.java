package Lab09;

import edu.fcps.Turtle;

public class TwistyTurtles extends Turtle {
	
	public TwistyTurtles() {
		super();
	}
	 
	public void drawShape() {
		for(int i=5;i<=400;i+=10) {
			forward(i);
			turnLeft(123);
		}
	}

}
