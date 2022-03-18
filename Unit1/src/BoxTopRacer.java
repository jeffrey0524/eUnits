import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

 public class BoxTopRacer extends Racer 
{
    public BoxTopRacer (int y)
     {
       super(y);
     }

    @Override
	public void jumpRight() {
	   int count = 0;
      turnLeft();
      while (!rightIsClear()) {
      move();
      count++;
     }
      turnRight();
      move();
      while (!rightIsClear()) {
      move();
     }
      turnRight();
      for (int i = 1; i <= count; i++) {
      move();
     }
      turnLeft();
	}

}