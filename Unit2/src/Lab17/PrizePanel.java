package Lab17;

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
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
      private int hits; 

		//constructor   
       public PrizePanel()
      {
    	   myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           
           int xPos = (int)(Math.random()*(FRAME-100) + 50);
           int yPos = (int)(Math.random()*(FRAME-100)+ 50);
           ball = new Ball(xPos, yPos, 50, Color.BLACK);
           
           xPos = (int)(Math.random()*(FRAME-100) + 50);
           yPos = (int)(Math.random()*(FRAME-100)+ 50);
           pd= new Polkadot(xPos,yPos,25,Color.red);
           
           t = new Timer(5, new Listener());
           t.start();
           
           addKeyListener(new Key());
           setFocusable(1==1);
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
              collide(ball,pd);
              
              ball.draw(myBuffer);
              pd.draw(myBuffer);
              
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
       
       private class Key extends KeyAdapter{
       		public void keyPressed(KeyEvent e) {
       			if(e.getKeyCode() == KeyEvent.VK_W) {
       				if(!(pd.getY()<20)) {
       					pd.setY(pd.getY()-10);
       				}
       			}else if(e.getKeyCode() == KeyEvent.VK_S) {
       				if(!(pd.getY()>FRAME-20)) {
       					pd.setY(pd.getY()+10);
       				}
       			}else if(e.getKeyCode() == KeyEvent.VK_A) {
       				if(!(pd.getX()<20)) {
       					pd.setX(pd.getX()-10);
       				}
       				
       			}else if(e.getKeyCode() == KeyEvent.VK_D) {
       				if(!(pd.getX()>FRAME-20)) {
       					pd.setX(pd.getX()+10);
       				}
       			}
       			if(e.getKeyCode() == KeyEvent.VK_8) {
       				ball.setY(ball.getY()-10);
       			}else if(e.getKeyCode() == KeyEvent.VK_2) {
       				ball.setY(ball.getY()+10);
       			}else if(e.getKeyCode() == KeyEvent.VK_4) {
       				ball.setX(ball.getX()-10);
       			}else if(e.getKeyCode() == KeyEvent.VK_6) {
       				ball.setX(ball.getX()+10);
       			}
       		}
       }
   }