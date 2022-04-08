import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Seeker extends Athlete {
    public Seeker()
      {
       super(1,1,Display.NORTH,0);
      }
    public void accrossRightWall()
      {
       while(rightIsClear() == false) {
           move();
       }
       turnRight();
       move();
     
       turnRight();
      }
    public void checkBeeper()
      {
       while(nextToABeeper() == false) {
           move();
       }
       pickBeeper();
       turnAround();
      }
    public void accrossLeftWall()
      {
       while(leftIsClear() == false) {
           move();
       }
       turnLeft();
       move();
    
       turnLeft();
       while(frontIsClear()) {
           move();
       }
      }
    public void turnar1()
      {
        turnRight();
        move();
        turnRight();
      }
    public void turnar2()
      {
        turnLeft();
        move();
        turnLeft();
      }
    
}