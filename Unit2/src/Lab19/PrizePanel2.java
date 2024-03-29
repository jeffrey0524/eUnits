package Lab19;

   //Name:    Date:
   import javax.swing.*;

import Lab11.Ball;
import Lab11.Polkadot;
//import Lab11.PinballPanel.Listener;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel2 extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot[] mypdarray;
      
      private Timer t; 
      private int hits; 

		//constructor   
       public PrizePanel2()
      {
    	   myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           
           int xPos = (int)(Math.random()*(FRAME-100) + 50);
           int yPos = (int)(Math.random()*(FRAME-100)+ 50);
           ball = new Ball(xPos, yPos, 50, Color.BLACK);
           
           mypdarray = new Polkadot[50];
           for(int k=0;k<mypdarray.length;k++) {
        	   xPos = (int)(Math.random()*(FRAME-100) + 50);
        	   yPos = (int)(Math.random()*(FRAME-100)+ 50);
        	   mypdarray[k]= new Polkadot(xPos,yPos,25,Color.red);
           }
           
           
           t = new Timer(5, new Listener());
           t.start();
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener{
          public void actionPerformed(ActionEvent e){
        	  myBuffer.setColor(BACKGROUND);
              myBuffer.fillRect(0, 0, FRAME,FRAME);
              
              ball.move(FRAME, FRAME);
              for(int i=0;i<mypdarray.length;i++) {
            	  collide(ball,mypdarray[i]);
              }
              
              
              ball.draw(myBuffer);
              for(int i=0;i<mypdarray.length;i++) {
            	  mypdarray[i].draw(myBuffer);
              }
              
              
              myBuffer.setColor(Color.black);
              myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
              myBuffer.drawString("Count: "+ hits, FRAME - 150, 25);
              repaint();
          }
      } 
       
       private void collide(Ball b, Polkadot pd){
        double d = distance(  b.getX(),b.getY(),pd.getX(),pd.getY() );  
		if(d<=(b.getRadius()+pd.getRadius())) {
			hits++;
			pd.jump(FRAME, FRAME);
		}
      }
       
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));// enter the calculation here.
      }
   }