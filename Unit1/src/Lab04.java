import edu.fcps.karel2.Display;

public class Lab04 {
	public static void takeTheField(Athlete arg) {
		arg.move();
		arg.move();
		arg.move();
		arg.move();
		arg.turnRight();
		arg.move();
		arg.move();

	}
	
	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/arena.map");
		Display.setSpeed(50);
		
		Athlete one = new Athlete();
		Athlete two = new Athlete();
		Athlete three = new Athlete();
		Athlete four = new Athlete();
		Athlete five = new Athlete();
		Athlete six = new Athlete();
		Athlete seven = new Athlete();

		Lab04.takeTheField(one);
		one.move();
		one.move();
		one.move();
		one.turnLeft();
		one.move();
		one.move();
		one.turnAround();
		
		Lab04.takeTheField(two);
		two.move();
		two.turnLeft();
		two.move();
		two.turnAround();
		
		Lab04.takeTheField(three);
		three.move();
		three.move();
		three.move();
		three.move();
		three.move();
		three.turnLeft();
		three.move();
		three.turnAround();
		
		Lab04.takeTheField(four);
		four.move();
		four.move();
		four.move();
		four.move();
		four.turnRight();
		
		Lab04.takeTheField(five);
		five.move();
		five.move();
		five.move();
		five.turnRight();
		
		Lab04.takeTheField(six);
		six.move();
		six.move();
		six.turnRight();
		
		seven.move();
		seven.move();
		seven.move();
		seven.move();
		seven.move();
		seven.move();
		seven.turnRight();
		seven.move();

	}

}
