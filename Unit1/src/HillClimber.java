import edu.fcps.karel2.Display;

public class HillClimber extends Climber 
{
   public HillClimber(int x)
  {
   super(x);
  }
  
   public void climbUpLeft()
  {
   turnRight();
   move();
   turnLeft();
   move();
   move();
  }
  
   public void climbDownLeft()
  {
   move();
   move();
   turnLeft();
   move();
   turnRight();
  }
  
   public void climbUpRight()
  {
   turnLeft();
   move();
   turnRight();
   move();
   move();
  }
  
   public void climbDownRight()
  {
   move();
   move();
   turnRight();
   move();
   turnLeft();
  }
  
}