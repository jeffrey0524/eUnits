package Lab07;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class PolygonTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
       public PolygonTurtle()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public PolygonTurtle(double n, int s)
      {
    	 super(200,200,90);
         mySize = n;
         mySides = s;
      }
       public PolygonTurtle(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
      }
       public void setSize(double n)
      {
         mySize = n;
      }
       public void setSides(int s)
      {
         mySides = s;
      }
       public void drawShape()
      {
    	   /**/
    	  for(int j=1;j<=mySides;j++) {
    		   forward(mySize);
    		   turnLeft(360/mySides);
   		   }
    	   /**/
      }
   }