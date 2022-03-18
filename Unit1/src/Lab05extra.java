import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab05extra {
	
	
	public static void main(String[] args) {
		

		Display.openWorld("maps/shuttle.map");
		Display.setSpeed(10);
		
		Racer one = new Racer(1);
		Racer two = new Racer(4);
		Racer three = new Racer(7);
		
		Thread t1 = new Thread( one );
        Thread t2 = new Thread( two );
        Thread t3 = new Thread( three );
        
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
