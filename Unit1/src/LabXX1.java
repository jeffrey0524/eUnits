import edu.fcps.karel2.*;
    public class LabXX1
   {
       public static void main(String[] args)
      {
         Display.setSize(8, 8);
         Display.setSpeed(5);
         int x = (int)(Math.random() * 6 + 1);
         int y = (int)(Math.random() * (x - 1) + 1);
         WorldBackend.getCurrent().addWall(new Wall(1, 1, x, Display.VERTICAL));
         WorldBackend.getCurrent().putBeepers(2, y, 1);
          // Display.placeNSWall(1, 1, x);
         // Display.placeBeeper(2, y);
      
         Seeker karel = new Seeker();
         karel.accrossRightWall();
         karel.checkBeeper();
         karel.accrossLeftWall();
      }
   }