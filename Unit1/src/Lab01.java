import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab01 {
	
	
	
	public static void main(String[] args) {
		

		Display.openWorld("maps/school.map");
		Robot lisa = new Robot(1,1,Display.EAST,1);
		@SuppressWarnings("unused")
		Robot pete = new Robot(4,5,Display.SOUTH,1);
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.pickBeeper();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.putBeeper();
		
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.putBeeper();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		
		
	}
	
	

}
