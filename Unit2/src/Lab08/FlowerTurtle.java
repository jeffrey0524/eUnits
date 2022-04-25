package Lab08;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
      
         /**/
    	  for(int j=1;j<=3600;j+=1800/mySize) {
   		   forward(40);
   		   turnLeft(180);
   		   forward(40);
   		   turnLeft(1800/mySize/10);
  		  }
      	/**/
      
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
      
         /**/
    	  myColor=Color.GREEN;
  		  turnLeft(180);
  		  forward(60);
  		  turnLeft(120);
  		  forward(40);
  		  turnLeft(180);
  		  forward(40);
  		  turnLeft(300);
  		  forward(20);
  		  turnLeft(180);
  		  forward(20);
  		  turnLeft(300);
  		  forward(60);

      	/**/
      
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }