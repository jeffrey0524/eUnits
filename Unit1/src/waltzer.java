import edu.fcps.karel2.Display;

public class waltzer extends Dancer {

	public waltzer(int x) {
		super(x, 2, Display.NORTH , 0);
		// TODO Auto-generated constructor stub
	}

	public waltzer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		move();
		turnleft();
		move();
		turnAround();
		move();
		turnright();
		move();
		turnAround();

	}

}
