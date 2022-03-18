import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Athlete extends Robot {

	public Athlete() {
		super(1,1,Display.NORTH,Display.INFINITY);
		// TODO Auto-generated constructor stub
	}

	public Athlete(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	public void turnright() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void turnleft() {
		turnLeft();
	}
	public void putAndMove() {
		putBeeper();
		move();
	}
	public void moveput() {
		move();
		putBeeper();
	}
	public void putn(int n) {
		for(int k=1;k<=n;k++) {
			putBeeper();
		}
	}
	public void pickn(int n) {
		for(int k=1;k<=n;k++) {
			pickBeeper();
		}
	}
	public void keeppick() {
		while(nextToABeeper()) {
    		pickBeeper();
    	}
	}
}
