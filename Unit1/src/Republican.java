
public class Republican extends MazeEscaper {

	public Republican() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		while(!rightIsClear() && frontIsClear() && !nextToABeeper()) {
			move();
		}
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		if(rightIsClear()) {
			turnright();
			move();
		}else if (!frontIsClear() && !rightIsClear()) {
            turnLeft();
        }
	}

}
