package Lab18;

   import java.awt.*;
   import java.awt.image.*;

    public class Turtle
   {
      private static BufferedImage img;
      private static int black = 0;
      private static int blue = 255;       // 2^8-1
      private static int green = 65280;    //(2^8-1)*2^8
      private static int red = 16711680;   //(2^8-1)*2^16
      private static int white = 16777215; // 2^24-1
      
      private double x,y,theta;            // what does a Turtle know?
      private static Graphics graphics;
      private boolean penisdown;
      private Color turtleColor;
      private int x1,y1;
      
      static									 	 // a static initializer list
      {
         img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         graphics=img.getGraphics();
      }
       public Turtle()
      {
        // img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         x=img.getWidth()/2;           //start at center
         y=img.getHeight()/2;          //start at center
         theta=90;                     //start facing north
         penisdown = true ;
      }
       public static Image getImage()
      {
         return img;
      }
       public void turnLeft(double a)
      {
         theta += a;
      }
       public void forward(double r)
      {
         // Your code goes here!
    	   if(penisdown) {
    		   for(int i=0;i<=(int)r;i++) {
    			   x1=(int)(x - i*Math.cos(theta * Math.PI/180));
    			   y1=(int)(y - i*Math.sin(theta * Math.PI/180));
    			   img.setRGB(x1, y1, white);
    		   }
    	   }
    	   x=(int)(x- r*Math.cos(theta * Math.PI/180));
		   y=(int)(y- r*Math.sin(theta * Math.PI/180));
      }
       public void turnRight(double a)
       {
          theta -= a;
       }
       public void setpendown(boolean x)
       {
          penisdown =x;	   
       }
       public void setColor(Color c)
       {
    	   turtleColor=c;
    	   graphics.setColor(turtleColor);
       }
       public static void clear(Color c)
       {
          graphics.setColor(c);
          graphics.fillRect(0, 0, 800, 800);
          graphics.drawImage(img, 0, 0, 800, 400,null);
       }
       public static void clear()
       {
          clear(Color.black);
       }
   }