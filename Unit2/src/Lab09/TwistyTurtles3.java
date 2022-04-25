package Lab09;

import edu.fcps.Turtle;

public class TwistyTurtles3 extends Turtle {
	
	public TwistyTurtles3() {
		super();
	}
	 
	public void drawShape() {
		for(int i=25;i<=150;i+=5) {
			for(int j=1;j<=4;j++) {
				forward(i);
				turnLeft(90);
			}
			turnLeft(45);
		}
	}

}
