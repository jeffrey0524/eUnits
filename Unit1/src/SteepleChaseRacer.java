 public class SteepleChaseRacer extends Racer 
{
    public SteepleChaseRacer(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
		// TODO Auto-generated constructor stub
	}
	public SteepleChaseRacer (int y){
       super(y);
     }
	public void jumpRight() {
	  int count = 0;
      turnLeft();
      while (!rightIsClear()) {
	      move();
	      count++;
      }
      turnRight();
      move();
      turnRight();
      for (int i = 1; i <= count; i++) {
	      move();
	     }
	  turnLeft();
	}

}