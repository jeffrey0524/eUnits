package Lab20;

   //Name:    Date:
   import javax.swing.*;

import Lab11.Ball;
import Lab11.Polkadot;
//import Lab11.PinballPanel.Listener;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 800;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      
      private Pinball pb;
      private Prize[] array;
      private static final int num = 500;
      
      private Timer t; 
      private int hits =0; 

		//constructor   
       public PrizePanel()
      {
    	   myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           
           int xPos = (int)(Math.random()*(FRAME-100) + 50);
           int yPos = (int)(Math.random()*(FRAME-100)+ 50);
           pb = new Pinball(xPos, yPos, 10, Color.BLACK);
           pb.setbound(FRAME, FRAME);
           
           array = new Prize[num];
           for(int k=0;k<array.length;k++) {
        	   xPos = (int)(Math.random()*FRAME);
        	   yPos = (int)(Math.random()*FRAME);
        	   array[k]= new Prize(xPos,yPos,Math.random()*25,Color.red);
           }
           
           t = new Timer(5, new Listener());
           t.start();
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       /*private class Listener implements ActionListener{
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
      } */
       private class Listener implements ActionListener
         {
          public void actionPerformed(ActionEvent e)
           {
        	  myBuffer.setColor(Color.WHITE);
        	  myBuffer.fillRect(0,0,FRAME,FRAME);
             for(int k=0; k<num; k++)
             {
               if(pb.intersect(array[k]) && (array[k].getColor() == Color.red)) {
            	   hits ++;
            	   array[k].lightup();
               }
               	array[k].draw(myBuffer);
             }
             pb.tick();
             pb.draw(myBuffer);
             
             myBuffer.setColor(Color.black);
             myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
             myBuffer.drawString("Count: "+ hits, FRAME - 150, 25);
             repaint();
           }
         }
}