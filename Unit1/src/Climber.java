import edu.fcps.karel2.Display;

public class Climber extends Athlete 
{
	
	 public Climber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Climber(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}

	public Climber(int x)
	  {
	   super(x,1,Display.NORTH,1);
	  }
  
   public void climbUpLeft()
  {
   turnright();
   move();
   move();
   turnLeft();
   move();
  }
  
   public void climbDownLeft()
  {
   move();
   turnLeft();
   move();
   move();
   turnright();
  }
  
   public void climbUpRight()
  {
   turnLeft();
   move();
   move();
   turnright();
   move();
  }
  
   public void climbDownRight()
  {
   move();
   turnRight();
   move();
   move();
   turnLeft();
  }
  
}