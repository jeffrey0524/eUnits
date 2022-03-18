import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab02 {
	
	public static void main(String[] args) {
		

		Display.openWorld("maps/maze.map");
		Athlete lisa = new Athlete();
		//Display.setSpeed(10);
		lisa.putAndMove();
		lisa.turnRight();
		lisa.putAndMove();
		lisa.turnRight();
		lisa.putAndMove();
		lisa.turnLeft();
		lisa.putAndMove();
		lisa.turnLeft();
		lisa.putAndMove();
		lisa.turnRight();
		lisa.putAndMove();
		lisa.putAndMove();
		lisa.turnRight();
		lisa.putAndMove();
		lisa.turnLeft();
		lisa.putAndMove();
		lisa.turnLeft();
		lisa.putAndMove();
		lisa.putAndMove();
		lisa.putAndMove();
		lisa.putAndMove();
		lisa.turnRight();
		lisa.putAndMove();
		lisa.putAndMove();
		
		
	}
	
	

}
