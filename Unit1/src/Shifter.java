	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
      
      public void workCorner() {
    	  pickBeeper();
      }
      public void moveOneBlock() {
    	  move();
      }
      public void turnToTheRight() {
    	  turnLeft();
    	  turnLeft();
    	  turnLeft();

      }
      public void turnToTheNorth() {
    	  turnLeft();
      }
      
   	public void run() {
   		for (int k = 1 ; k < 10 ; k++) {
        	int count = getBeepers();
        	while(nextToABeeper()) {
        		pickBeeper();
        	}
        	for (int i = 1 ; i <= count ; i++) {
            	putBeeper();
            }
        	move();
        }
   	}
   }