import edu.fcps.karel2.Display;

public class breakdancer extends Dancer {

	public breakdancer(int x) {
		super(x, 2, Display.NORTH , 0);
		// TODO Auto-generated constructor stub
	}

	public breakdancer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		turnleft();
		move();
		turnAround();
		turnAround();
		turnAround();
		move();
		turnAround();
		turnAround();
		turnleft();
	}

}
