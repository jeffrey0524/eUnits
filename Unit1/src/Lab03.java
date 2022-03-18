import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab03 {
	
	public static void main(String[] args) {
		

		Display.openWorld("maps/mountain.map");
		Display.setSpeed(50);
		Climber lisa = new Climber(8);
		Climber lisat = new Climber(8);
		lisa.move();
		lisat.move();
		lisa.climbUpRight();
		lisat.climbUpRight();
		lisa.climbUpRight();
		lisat.climbUpRight();
		lisa.climbUpRight();
		lisat.climbUpRight();
		lisa.climbDownLeft();
		lisat.climbDownLeft();
		lisa.climbDownLeft();
		lisat.climbDownLeft();
		lisa.pickBeeper();
		lisa.turnLeft();
		lisat.turnLeft();
		//方向上
		lisa.climbUpLeft();
		lisat.climbUpLeft();
		lisa.climbUpLeft();
		lisat.climbUpLeft();
		//方向上,山頂
		lisa.turnLeft();
		lisat.turnLeft();
		lisa.climbDownRight();
		lisat.climbDownRight();
		lisa.climbDownRight();
		lisat.climbDownRight();
		lisa.climbDownRight();
		lisat.climbDownRight();
		lisa.move();
		lisat.move();
		
		
		
	}
	
	

}
