import edu.fcps.karel2.Display;

public class squaredancer extends Dancer {

	public squaredancer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public squaredancer(int x) {
		super(x, 2, Display.NORTH , 0);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		move();
		turnLeft();
		move();
		turnleft();
		move();
		turnleft();
		move();
		turnleft();
	}

}
