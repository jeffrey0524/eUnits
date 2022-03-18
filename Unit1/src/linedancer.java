import edu.fcps.karel2.Display;

public class linedancer extends Dancer {

	public linedancer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public linedancer(int x) {
		super(x, 2, Display.NORTH , 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		move();
		  move();
		  turnLeft();
		  turnLeft();
		  move();
		  move();
		  turnLeft();
		  turnLeft();
	}

}
