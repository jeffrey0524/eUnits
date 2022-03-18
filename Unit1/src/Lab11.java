import edu.fcps.karel2.Display;
//import edu.fcps.Digit;

public class Lab11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.setSize(50, 32);
        Display.setSpeed(10);
        
		new One(1,9).display();
		new Zero(7,9).display();
		new Night(13,9).display();
		new Three(19,9).display();
		new Two(25,9).display();
		new Zero(32,9).display();
		new Zero(38,9).display();
		new Six(44,9).display();
	}
}
