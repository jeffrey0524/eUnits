import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab05 {
	
	
	public static void main(String[] args) {
		

		Display.openWorld("maps/shuttle.map");
		Display.setSpeed(10);
		
		Racer one = new Racer(1);
		Racer two = new Racer(4);
		Racer three = new Racer(7);
		
		one.shuttle(2,7);
		one.shuttle(4,5);
		one.shuttle(6,3);
		one.move();
		two.shuttle(2,7);
		two.shuttle(4,5);
		two.shuttle(6,3);
		two.move();
		three.shuttle(2,7);
		three.shuttle(4,5);
		three.shuttle(6,3);
		three.move();
		
		
		
		
	}
	
	

}
