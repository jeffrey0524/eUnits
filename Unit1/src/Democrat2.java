
public class Democrat2 extends MazeEscaper2 {

	public Democrat2() {
		// TODO Auto-generated constructor stub
	}

	public Democrat2(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		while(!leftIsClear() && frontIsClear() && !nextToABeeper()) {
			move();
		}
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		if(leftIsClear()) {
			turnleft();
			move();
		}else if (!frontIsClear() && !leftIsClear()) {
            turnright();
        }
	}

}
